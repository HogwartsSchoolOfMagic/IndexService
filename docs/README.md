<!--suppress HtmlDeprecatedAttribute -->
<div align="center">
    <h1>
        <a href="https://hogwartsschoolofmagic.github.io/IndexService/">IndexService</a>
    </h1>
</div>

<div align="center">
    <a href="https://github.com/HogwartsSchoolOfMagic/IndexService/blob/master/docs/translations/README_EN.md">
        <img alt="english-version" src="https://raw.githubusercontent.com/HogwartsSchoolOfMagic/IndexService/master/assets/languages/english.png"/>
    </a>
</div>

<div align="center">
    <img src="https://img.shields.io/github/last-commit/HogwartsSchoolOfMagic/IndexService" height="25" alt="last-commit" />
    <a href="https://wakatime.com/@SmithyVL"><img src="https://wakatime.com/badge/github/HogwartsSchoolOfMagic/IndexService.svg" height="25" alt="time-with-code" /></a>
    <a href="https://sonarcloud.io/code?id=HogwartsSchoolOfMagic_IndexService"><img src="https://sonarcloud.io/api/project_badges/measure?project=HogwartsSchoolOfMagic_IndexService&metric=ncloc" height="25" alt="sonar-code-lines" /></a>
    <a href="https://sonarcloud.io/summary/new_code?id=HogwartsSchoolOfMagic_IndexService"><img src="https://sonarcloud.io/api/project_badges/measure?project=HogwartsSchoolOfMagic_IndexService&metric=alert_status" height="25" alt="sonar-quality-gate-status" /></a>
    <a href="https://github.com/HogwartsSchoolOfMagic/IndexService/actions/workflows/ci.yml"><img src="https://github.com/HogwartsSchoolOfMagic/IndexService/actions/workflows/ci.yml/badge.svg" height="25" alt="ci" /></a>
</div>

### 📖 Описание

___

Сервис для хранения и получения данных из эластика.

### ❗ Требования

___

* **JDK**: 18 и выше.

### 📋 Инструкции по сборке и запуску

___

*Все команды выполняются в консоли. Для всех действий можно использовать IDE, но кто это знает — тот так и будет делать
и инструкция ему не нужна.*

<details style="margin-left: 40px">
   <summary><b>Клонирование репозитория</b></summary>
   <ol>
      <li>Создаем папку: <code>mkdir GitProjects</code> (имя папки может быть любым, но вам нужно будет продолжать 
использовать только его);</li>
      <li>Переходим в папку: <code>cd GitProjects</code>;</li>
      <li>Клонируем репозиторий: <code>git clone https://github.com/HogwartsSchoolOfMagic/IndexService.git</code>;</li>
      <li>Переходим в созданную папку: <code>cd IndexService</code>.</li>
      <li>Выполнено.</li>
   </ol>
</details>

<details style="margin-left: 40px">	
   <summary><b>Сборка проекта</b></summary>
   <p>Внутри папки: <code>IndexService</code>, нужно выполнить команду: <code>mvn clean install</code>.</p>
</details>

<details style="margin-left: 40px">	
   <summary><b>Запуск приложения</b></summary>

   <p>После сборки приложения выполните команду: <code>mvn spring-boot:run</code>. <b>Стандартный порт: 8777</b>.</p>
</details>

### ⚙ Включает функциональность

___

- Пока только запуск сервиса без логики.

### 🔨 Стек технологий

___

- Spring Boot: WEB, Admin client;
- Spring Cloud: Config client, Eureka client;
- Lombok.

### 🎫 Лицензия

___

**[Apache License Version 2.0](https://github.com/HogwartsSchoolOfMagic/IndexService/blob/master/LICENSE)**

_Copyright ©2022, Владислав [[SmithyVL]](https://github.com/SmithyVL) Кузнецов_