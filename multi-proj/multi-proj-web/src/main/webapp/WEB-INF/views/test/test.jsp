<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div id="app">
    {{ str }} <br />
    <button v-on:click="logText">click me1</button>
  </div>

  <div id="app1">
        <app1-headers></app1-headers>
        {{ num }}
  </div>

  <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
  <script>
    new Vue({
        el: '#app',
        methods: {
            logText : function() {
                console.log('clicked!')
            }
        },
        data: {
         str: 'Hello Vue!'
        }
    })

    new Vue({
            el : '#app1',
            data: {
                num: 10,
            },
            components: {
                'app1-headers' : {
                    template : '<h1>헤더 컨포넌트</h1>'
                } 
            }
    })
  </script>
</body>
</html>