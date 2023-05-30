<h4 align="right"><strong>English</strong> | <a href="https://github.com/qimu666/EazyWeb/blob/main/README_CN.md">简体中文</a></h4>

<p align="center">
    <img src=https://img.qimuu.icu/typory/response.png width=138/>
</p>


<h1 align="center">EazyWeb</h1>
<p align="center"><strong>Quickly build web applications, integrate Knife4j interface documentation, customize error codes and global exception handlers, all in EazyWeb.</strong></p>

<div align="center">
    <img alt="Maven" src="https://raster.shields.io/badge/Maven-3.8.1-red.svg"/>
   <img alt="SpringBoot" src="https://raster.shields.io/badge/SpringBoot-2.7+-green.svg"/>
    <a href="https://www.cnblogs.com/qimu666/">
    <img alt="Blog" src="https://raster.shields.io/badge/Blog-Qimu666-blue.svg"/>
    </a>
       <img alt="Knife4j" src="https://raster.shields.io/badge/Knife4j-3.0+-orange.svg"/>
</div>


## Quick Start 🏁

To get started with EazyWeb, you can follow these simple steps:

1. Create a SpringBoot project without adding <span style="color:red">`Web dependencies`</span>.

2. Add the dependency coordinates:

   ```xml
   <dependency>
       <groupId>icu.qimuu</groupId>
       <artifactId>EazyWeb</artifactId>
       <version>0.0.1</version>
   </dependency>
   ```

3. Configuration information: where <span style="color: red">`Controller and matching strategy: ant_ Path_ Matcher`</span>must be configured

   - Simplified configuration:

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
   
  - Full configuration：

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

4. Refresh the dependencies.

## Our Advantages 😎

  **Compared with the traditional way of creating web projects, there is no need to integrate interface documents, and it has rich error codes and flexible global exception handlers.**

- Traditional way of creating web projects:

  1. Create a new project.

  2. Write a global exception handler.

  3. Integrate the interface document.

  4. Customize error codes.

  5. Customize the common return class.

  6. Write business code.

- Use **EazyWeb**:
  1. Create a new project.
  2. Add EazyWeb coordinates.
  3. Configure scanning paths and scanning policies.
  4. Write business code.

## Features 🌟

EazyWeb provides a variety of features to make your web development process easier and more efficient. Some key features include:

- Quick and easy web application construction.
- Simple and intuitive API.
- Flexibility to customize your web application.
- And more!

## Contribution 🤝

If you have any questions or suggestions about EazyWeb, please feel free to contact us at any time: 📩 Email: 2483482026@qq.com .

## Contact Us 📩

If you have any questions or suggestions about EazyWeb, please feel free to [contact us](2483482026@qq.com).

Thank you for using EazyWeb! 😊
