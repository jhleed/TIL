# Polymer Style

polymer 의 style 기능과 관련된 실험실

## Style 동적으로 제어하기 

웹 사이트의 테마를 클릭 한번으로 변경하고 싶다.
아래와 같이 전역 스타일을 동적으로 제어한다. 

1. index.html 상단의 `<head>` 내에서 theme html 을 import 하는 부분을 스크립트를 이용하여 구현한다. 
    - 이 때, 스타일이 적용될 커스텀 엘리먼트보다 상단에 적용되어야 한다. 왜냐하면 커스텀 엘리먼트 
```$xslt
<head>
    <meta charset="UTF-8">
    <title>polymer-style</title>
    <script>
        /* 동적으로 테마의 정보를 불러오도록 함*/
        let defaultColor = "red";
        let linkEle = document.createElement("link");
        linkEle.rel = "import";
        let savedTheme = localStorage.getItem("theme");
        let theme = (savedTheme) ? savedTheme : defaultColor;
        linkEle.href = "theme/" + theme + "/my-theme.html";
        document.head.appendChild(linkEle);
    </script>

    <!--theme 의 style 을 먼저 불러와야 하므로 커스텀 엘리먼트는 스크립트 밑에 넣어줘야 함 -->
    <link rel="import" href="my-foo.html">
</head>
```    
    

2. 원하는 테마의 색상은 localStorage 에 저장한다. 저장된 테마의 값은 1번에서 불러온다. 

```
디렉토리 경로를 이용하여 원하는 테마를 가져올 수 있다.
/{themeColor}/my-theme.html
themeColor의 값은 localStorage에 저장되어 있음.
```

3. 테마의 적용을 원하는 커스텀 엘리먼트에서는 아래처럼 import 해주면 된다.
```
<style include="my-theme"></style>
``` 

## Slot

`구멍`, `빈 틈`이라는 뜻을 가지고 있으며 외부에서 커스텀 엘리먼트를 주입할 수 있다.

> 참고 : polymer 1.x 에서는 content 라는 이름으로 사용되었다. 

아래 예제의 구성은 index.html 에서 커스텀 엘리먼트인 my-foo 를 import 해서 사용하는 것을 가정한다.
즉, index.html 의 element 를 slot을 사용하여 my-foo.html 으로 전달하는 것이다.

### 가장 간단한 형태의 slot

index.html
외부에서 slot 을 사용한 엘리먼트 주입
```
<my-foo>
    <span slot="slot-foo">i am foo</span> <!-- slot 이름으로 매칭 -->
</my-foo>
```

my-foo.html 
slot 으로 들어올 엘리먼트의 위치를 지정한다.
```$xslt
<p>this is slot foo ->
    <slot name="slot-foo"></slot>
</p>
```

### 동일한 이름의 slot 을 중복해서 사용하는 경우

외부에서 1개의 slot 을 주입한다.
```$xslt
<my-foo>
    <span slot="slot-foo">i am foo</span>
</my-foo>
```

my-foo 에서 동일한 이름의 slot 2개를 받는다면? 
```$xslt
<p>this is slot foo ->
    <slot name="slot-foo"></slot>
</p>
<p>this is slot foo ->
    <slot name="slot-foo"></slot>
</p>
```

제일 처음으로 매칭되는 엘리먼트에만 값이 주입된다. 

```$xslt
this is slot foo -> i am foo

this is slot foo ->
```

### slot 의 style

기본적으로는 주입하는 쪽에서 스타일을 지정한다.

index.html
```$xslt
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Style - Slot</title>
    <link rel="import" href=my-foo.html>
    <style>
        #span-slot{
            color : red;
        }
    </style>
</head>
<body>
    <h1>Style Slot</h1>
    <my-foo>
        <span id="span-slot" slot="slot-foo">i am foo</span> <!-- 빨간색으로 지정됨 -->
    </my-foo>
</body>
</html>
```

my-foo.html
```$xslt
<template>
    <style>
    
        /* 유효하지 않은 스타일 지정자 */  
        #slot {
            color : blue;
        }

        #span-slot{
            color : blue;
        }
    </style>
    <h1>It's foo</h1>
    <p>this is slot foo ->
        <slot id="slot" name="slot-foo"></slot>
    </p>
</template>
```

[::slotted()를 사용하면 내부에서 slot 으로 들어오는 요소의 스타일을 지정할 수 있다.](https://www.polymer-project.org/2.0/docs/devguide/style-shadow-dom#style-slotted-content-distributed-children)

`::slotted(selector syntax)` : slot 으로 들어온 엘리먼트와 selector 가 매칭되도록 한다.

`::slotted(*)` : slot 으로 들어온 모든 요소에 매칭

index.html
```$xslt
<my-foo>
    <span class="slot-bar" slot="slot-bar">i am bar, hello foo?</span><!--slot-bar 클래스 지정-->
</my-foo>
```

my-bar.html
```$xslt
<template>
    <style>
        /* slot으로 들어왔으면서 slot-bar 클래스를 가진 스타일에 속성 주입*/
        ::slotted(.slot-bar) {
            color : blue;
        }
    </style>
    <h1>It's foo</h1>
    <p>this is slot bar ->
        <slot name="slot-bar"></slot>
    </p>
</template>
```


### n개의 slot 

index.html
```$xslt
<my-foo>
    <span id="span-slot" slot="slot-foo">i am foo</span>
    <span slot="slot-bar">i am bar, hello foo?</span>
</my-foo>
```

my-foo.html
```$xslt
<p>this is slot bar ->
    <slot name="slot-bar"></slot>
</p>
<p>this is slot foo ->
    <slot name="slot-foo"></slot>
</p>
```

result
```$xslt
this is slot bar -> i am bar, hello foo?
this is slot foo -> i am foo
```

### slot 으로 custom element 전달하기

index.html
my-baz 커스텀 엘리먼트 전달
```$xslt
<my-foo>
    <span id="span-slot" slot="slot-foo">i am foo</span>
    <span slot="slot-bar">i am bar, hello foo?</span>
    <my-baz slot="slot-baz"></my-baz>
</my-foo>
```

my-foo.html
```$xslt
<p>this is slot baz
    <slot name="slot-baz"></slot>
</p>
```

### 내부에서는 외부에서 주입받은 slot 을 컨트롤 할 수 없다.

my-foo.html
```$xslt
<p>this is slot baz
    <slot name="slot-baz"></slot> <!-- select 및 제어 불가능 -->
</p>
```

