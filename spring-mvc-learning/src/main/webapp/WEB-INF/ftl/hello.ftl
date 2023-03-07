<style>
        * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
        }

        .home {
                margin: 0 auto;
                max-width: 1500px;
                display: flex;
                justify-content: center;
                flex-wrap: wrap;
        }

        .item {
                border: 1px solid #ccc;
                width: 300px;
                height: 300px;
        }

        .box {
                display: flex;
                justify-content: center;
                align-items: center;
                flex-wrap: wrap;
        }

        .box .item {
                margin: 10px;
                display: flex;
                flex-direction: column;
                justify-content: center;
                align-items: center;
                padding: 10px;
        }

        .box img {
                width: 120px;
                height: 120px;
        }
        .name{
                font-size: 20px;
                font-weight: bold;
        }
        .title{
                font-size: 16px;
                text-align: center;
        }
</style>

<div class="home">
        <div class="box">
                <#list listData as data>
                        <div class="item">
                                <div class="name">${data.name}</div>
                                <img src="${data.avatar}"/>
                                <div class="title">${data.title}</div>
                        </div>
                </#list>
        </div>
</div>
