<!--suppress HtmlDeprecatedAttribute -->
<div align="center">
    <h1>
        <a href="https://hogwartsschoolofmagic.github.io/IndexService/">IndexService</a>
    </h1>
</div>

<div align="center">
    <a href="https://github.com/HogwartsSchoolOfMagic/IndexService/blob/master/docs/README.md">
        <img alt="russian-version" src="https://raw.githubusercontent.com/HogwartsSchoolOfMagic/IndexService/master/assets/languages/russian.png"/>
    </a>
</div>

<div align="center">
    <img src="https://img.shields.io/github/last-commit/HogwartsSchoolOfMagic/IndexService" height="25" alt="last-commit" />
    <a href="https://wakatime.com/@SmithyVL"><img src="https://wakatime.com/badge/github/HogwartsSchoolOfMagic/IndexService.svg" height="25" alt="time-with-code" /></a>
    <a href="https://sonarcloud.io/code?id=HogwartsSchoolOfMagic_IndexService"><img src="https://sonarcloud.io/api/project_badges/measure?project=HogwartsSchoolOfMagic_IndexService&metric=ncloc" height="25" alt="sonar-code-lines" /></a>
    <a href="https://sonarcloud.io/summary/new_code?id=HogwartsSchoolOfMagic_IndexService"><img src="https://sonarcloud.io/api/project_badges/measure?project=HogwartsSchoolOfMagic_IndexService&metric=alert_status" height="25" alt="sonar-quality-gate-status" /></a>
    <a href="https://github.com/HogwartsSchoolOfMagic/IndexService/actions/workflows/ci.yml"><img src="https://github.com/HogwartsSchoolOfMagic/IndexService/actions/workflows/ci.yml/badge.svg" height="25" alt="ci" /></a>
</div>

### 📖 Description

___

A service for storing and receiving data from elastic.

### ❗ Requirements

___

* **JDK**: 18 and higher;

### 📋 Build and start-up instructions

___

*All commands are executed in the console. For all actions, you can use the IDE, but who knows about it — and
will do it, the instruction is not needed.*

<details style="margin-left: 40px">	
   <summary><b>Clone Repository</b></summary>

1. Create a folder: `mkdir GitProjects` (the folder name can be anything, but you will need to continue to use only it);
2. Go to the folder: `cd GitProjects`;
3. Cloning a repository: `git clone https://github.com/HogwartsSchoolOfMagic/IndexService.git`;
4. Go to the folder: `cd IndexService`;
5. Complete.

</details>

<details style="margin-left: 40px">	
   <summary><b>Build project</b></summary>

Inside the folder: <code>IndexService</code>, you need to run the command: <code>mvn clean install</code>.
</details>

<details style="margin-left: 40px">	
   <summary><b>Application launch</b></summary>

After building the application, execute the command: <code>mvn spring-boot:run</code>. <b>Default port: 8777</b>.
</details>

### ⚙ Includes functionality

___

- So far, only the launch of the service without logic.

### 🔨 Technology stack

___

- Spring Boot: Admin client, WEB;
- Spring Cloud: Config client, Eureka client;
- Lombok.

### 🎫 License

___

**[Apache License Version 2.0](https://github.com/HogwartsSchoolOfMagic/IndexService/blob/master/LICENSE)**

_Copyright ©2022, Vladislav [[SmithyVL]](https://github.com/SmithyVL) Kuznetsov_