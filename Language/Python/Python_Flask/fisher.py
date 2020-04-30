from flask import Flask, make_response

app = Flask(__name__)
#读取配置文件
app.config.from_object('config')
print(app.config['DEBUG'])  # 参数要大写  DEBUG 有缺省值， 为False

#兼容了不加/的情况
#装饰器注册路由
@app.route('/hello')
def hello():
    # status code 200, 404, 301
    # content-type http headers  告诉浏览器如何解析返回值
    # content-type 缺省值为   text/html
    # 修改缺省值
    headers = {
        'content-type': 'application/json',    #用json解析内容
        'location': 'http://www.bing.com'
    }
    # Response  创建response 对象    状态码为status = 404  显示内容与
    response = make_response('<html></html>', 301)
    response.headers = headers
    return response
    #以上三行创建response可被代替
    # return '<html></html>', 301, headers
    
    # return '<html><p>HELLO</p></html>'    #默认当作html标签来处理

#注册路由     如果想采用基于类的视图
#app.add_url_rule('/hello', view_func = hello)

#每次需要重启服务器才能保存修改
#启动Web服务器  Flask 自带服务器
#debug = True  开启调试器模式 , 在开发时，不可开启调试模式
# host = ‘0.0.0.0’  代表可以外网接受访问   port 为端口号
if __name__ == '__main__':   #只有当前文件被当作入口文件时，才会启动服务器，而非在作为模块被导入到其他文件张时
    #在生产环境中， 不使用自带服务器，   而是使用nginx + uwsgi 来启动，当前文件作为模块被启动
    app.run(host = '0.0.0.0', debug = True, port = 81)
