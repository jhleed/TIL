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

