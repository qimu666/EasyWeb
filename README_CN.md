<h4 align="right"><a href="https://github.com/qimu666/EazyWeb/blob/main/README.md">English</a> | </strong> 简体中文</strong></h4>

<p align="center">
    <img src=https://img.qimuu.icu/typory/response.png width=138/>
</p>

<h1 align="center">EazyWeb</h1>
<p align="center"><strong>快速构建Web应用，整合Knife4j接口文档，自定义错误码和全局异常处理器，一切尽在EazyWeb。</strong></p>

<div align="center">
    <img alt="Maven" src="https://raster.shields.io/badge/Maven-3.8.1-red.svg"/>
   <img alt="SpringBoot" src="https://raster.shields.io/badge/SpringBoot-2.7+-green.svg"/>
    <a href="https://www.cnblogs.com/qimu666/">
    <img alt="Blog" src="https://raster.shields.io/badge/Blog-柒木木-blue.svg"/>
    </a>
        <img alt="Knife4j" src="https://raster.shields.io/badge/Knife4j-3.0+-orange.svg"/>
</div>

## 快速启动 🏁

要开始使用 EazyWeb，您可以按照以下简单步骤进行操作:

1. 创建SpringBoot项目无需引入<span style="color:red">`Web依赖`</span>

2. 引入依赖坐标

   ```xml
   <dependency>
       <groupId>icu.qimuu</groupId>
       <artifactId>EazyWeb</artifactId>
       <version>0.0.1</version>
   </dependency>
   ```

3. 配置信息：其中<span style="color:red">`Controller和 matching-strategy: ant_path_matcher`</span>必须配置

   - 简略配置：

   ```yml
   knife4j:
     config:
       scan-path: com.qimuu.demo.controller
   spring:
     profiles:
       active: dev
     mvc:
       path match:
         matching-strategy: ant_path_matcher
   ```

   - 全量配置：

   ```yml
   knife4j:
     config:
       name: Author
       email: xxx
       version: API version
       title: API document
       description: API document description
       scan-path: com.qimuu.demo.controller
   spring:
     profiles:
       active: dev
     mvc:
       path match:
         matching-strategy: ant_path_matcher
   ```

 4. 刷新依赖

## 我们的优势😎

  **相比传统的创建Web项目，无需整合接口文档，拥有丰富的错误码，灵活的全局异常处理器。**

- 传统的创建Web项目：

  1. 创建新的项目

  2. 编写全局异常处理器

  3. 整合接口文档

  4. 自定义错误码

  5. 自定义通用返回类

  6. 编写业务代码

-  使用**EazyWeb**
  1. 创建新的项目
  2. 引入EazyWeb坐标
  3. 配置扫描路径和扫描策略
  4. 编写业务代码

## 特点 🌟

EazyWeb 提供了各种功能，使您的 Web 开发过程更加轻松和高效。一些关键功能包括：

- 快速简单的 Web 应用程序构建
- 简单直观的 API
- 灵活性，可以自定义您的 Web 应用程序
- 还有更多！

## 贡献 🤝

如果您想为 EazyWeb 做出贡献，请随时提交拉取请求。我们始终在寻找方法来改进项目，使其对像您这样的开发者更有用。

## 联系我们 📩

如果您对 EazyWeb 有任何问题或建议，请随时联系我们:📩邮箱：2483482026@qq.com。

感谢您使用 EazyWeb！ 😊
