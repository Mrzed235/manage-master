## 系统名称 
管理系统 manager-master 
### 系统概要
管理系统为系统模块。其中系统模块底下又有其子模块。
### 功能模块
#### 一、系统模块
##### 1、用户登陆
###### 校验用户名、密码以及验证码
###### 登陆成功将登陆信息写入登陆日志
###### 未登录直接访问服务器资源进行拦截
##### 2、菜单管理
###### 全查询菜单和根据左边的树查询不同菜单
###### 菜单的添加、修改、删除
##### 3、角色管理
###### 全查询角色和模糊查询
###### 角色的添加、修改、删除以及给角色分配权限
##### 4、用户管理
###### 全查询用户和模糊查询
###### 用户的添加、修改、删除、重置密码以及给用户分配角色
##### 5、部门管理
###### 全查询部门、模糊查询以及根据左边的树查询不同的部门
###### 部门的添加、修改、删除

### 技术选型
#### 后台技术选型
* SpringBoot
* Shiro
* MybatisPlus
#### 前端技术选型
* LayUI、DTree

### 开发环境
* 操作系统：Windows 10
* 编程语言：Java
* 开发工具：IDEA、Navicat、Git
* 项目构建：Maven 3.5.2
* 服务器：Tomcat 8.5
* 数据库：MySQL 5.0
* 代码托管平台：GitHub

### 预览效果
登陆页面
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/login.PNG)
部门管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/dept.PNG)
菜单管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/menu.PNG)
权限管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/permission.PNG)
角色管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/role.PNG)
用户管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/user.PNG)
登陆日志管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/loginfo.PNG)
系统公告管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/notice.PNG)
缓存管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/cache.PNG)
