<h4 align="right"><a href="https://github.com/qimu666/EasyWeb/blob/main/README.md">English</a> | </strong>
简体中文</strong></h4>

<p align="center">
    <img src=https://img.qimuu.icu/typory/response.png width=138/>
</p>

<h1 align="center">EasyWeb</h1>
<p align="center"><strong>快速构建Web应用，整合Knife4j接口文档，自定义错误码和全局异常处理器，一切尽在EasyWeb。</strong></p>

<div align="center">
    <img alt="Maven" src="https://raster.shields.io/badge/Maven-3.8.1-red.svg"/>
   <img alt="SpringBoot" src="https://raster.shields.io/badge/SpringBoot-2.7+-green.svg"/>
    <a href="https://www.cnblogs.com/qimu666/">
    <img alt="Blog" src="https://raster.shields.io/badge/Blog-柒木木-blue.svg"/>
    </a>
        <img alt="Knife4j" src="https://raster.shields.io/badge/Knife4j-3.0+-orange.svg"/>
</div>

## 快速启动 🏁

要开始使用 EasyWeb，您可以按照以下简单步骤进行操作:

1. 创建SpringBoot项目无需引入<span style="color:red">`Web依赖`</span>

2. 引入依赖坐标

   ```xml
   <dependency>
      <groupId>icu.qimuu</groupId>
      <artifactId>EasyWeb</artifactId>
      <version>0.0.5</version>
   </dependency>
   ```

3. 配置信息：其中<span style="color:red">`matching-strategy: ant_path_matcher`</span>必须配置

   - 简略配置：

   ```yml
   spring:
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

   使用时需要在控制层类上加上`@RestController`或`@Controller`注解

4. **示例代码**

    ```java
    @GetMapping("/getPoisonousChickenSoupNotSetKey")
    public BaseResponse<PoisonousChickenSoupResponse> getPoisonousChickenSoupNotSetKey() {
        PoisonousChickenSoupResponse poisonousChickenSoup = null;
        try {
            poisonousChickenSoup = apiService.getPoisonousChickenSoup();
        } catch (BusinessException e) {
            throw new BusinessException(e.getCode(), e.getMessage());
        }
        return ResultUtils.success(poisonousChickenSoup);
    }
    ```

5. 响应示例：


    ```json
    {
      "code": 0,
      "data": {
        "text": "人类三大错觉—手机响了，有人敲门，他（她）喜欢我。"
      },
      "message": "ok"
    }
    ```

## 我们的优势😎

**相比传统的创建Web项目，无需整合接口文档，拥有丰富的错误码，灵活的全局异常处理器。**

- 传统的创建Web项目：

    1. 创建新的项目

    2. 编写全局异常处理器

    3. 整合接口文档

    4. 自定义错误码

    5. 可以自定义自己内部通用返回类

    6. 编写业务代码
- 使用**EasyWeb**
1. 创建新的项目
2. 引入EazyWeb坐标
3. 配置扫描路径和扫描策略
4. 编写业务代码

## 自定义错误码👌

- 通过实现`Error接口`即的可定义属于自己的团队的错误处理规范！！！

 示例:

 ```java
  public enum ErrorCode implements Error {
    /**
     * 状态码
     */
    private final int code;

    /**
     * 错误信息
     */
    private final String message;

    /**
     * 成功
     */
    SUCCESS(0,"ok"),

    /**
     * 请求参数错误
     */
    PARAMS_ERROR(40000,"请求参数错误")；

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
 ```

## 特点 🌟

EasyWeb 提供了各种功能，使您的 Web 开发过程更加轻松和高效。一些关键功能包括：

- 快速简单的 Web 应用程序构建
- 简单直观的 API
- 灵活性，可以自定义您的 Web 应用程序
- 还有更多！

## 贡献 🤝

如果您想为 EasyWeb 做出贡献，请随时提交拉取请求。我们始终在寻找方法来改进项目，使其对像您这样的开发者更有用。

## 联系我们 📩

如果您对 EasyWeb 有任何问题或建议，请随时联系我们:📩邮箱：2483482026@qq.com。

感谢您使用 EasyWeb！ 😊
