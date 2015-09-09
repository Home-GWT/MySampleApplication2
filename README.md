Установка/Настройка/Создание GWT-приложения

1. `нужен инструмент Google Web Toolkit (GWT)`: [http://olex.openlogic.com/packages/gwt/2.7.0](http://olex.openlogic.com/packages/gwt/2.7.0) ( [http://www.gwtproject.org/download.html](http://www.gwtproject.org/download.html) )
   Скачали и распаковали его...
   Первоначально можно создать (Java Enterprice) 'Google Web Toolkit' непустое приложение типа 'Hello World'. При этом нужно указать где лежит библиотека gwt/2.7.0
   IDE сгенерит нам такое демо-приложение...
2. Дальше можно настроить порт на которм будет запускаться это GWT-приложение [http://stackoverflow.com/questions/19093363/how-to-add-program-arguments-in-to-intellij-idea-gwt-project](http://stackoverflow.com/questions/19093363/how-to-add-program-arguments-in-to-intellij-idea-gwt-project):
   В 'GWT Configuration', в поле 'Dev Mode parameters' прописать '-port 8889'
3. Такое GWT-приложения имеет клиентскую и серверную часть.
   С помощью инструмента Google Web Toolkit (GWT) из Java-кода автоматом генерится JavaScript (именно) для клиентской части.
   Обмен данными между клиентом и сервером происходит через объекты 'SOAP сервисы'.
   Поэтому существует конфигурационный документ-описания формы взаимодействия между клиентом и сервером - 'MyApplication...gwt.xml' - именно этим файлом запускается это GWT-приложение.
4. GWT-приложение деплоится/разворачивается и запускется также как и обычное Web-приложение - на сервере приожений (например: Tomcat).
   Но (в помощь) для удобства разрабочиков, инструмент 'Google App Engine SDK' имеет локальный сервер приложений 'Jetty'. Его ( [appengine-java-sdk-1.9.26.zip](https://storage.googleapis.com/appengine-sdks/featured/appengine-java-sdk-1.9.26.zip) ) можно скачать на [https://cloud.google.com/appengine/downloads?csw=1](https://cloud.google.com/appengine/downloads?csw=1)
   или же через инструмент 'maven' [http://mvnrepository.com/artifact/com.google.appengine/appengine-java-sdk/1.9.18](http://mvnrepository.com/artifact/com.google.appengine/appengine-java-sdk/1.9.18)
5. Здесь его базовые конфигурационный настройки:
   appengine-java-sdk-1.9.26/lib/jetty-base-sdk/
   appengine-java-sdk-1.9.26/lib/java-managed-vm/appengine-java-vmruntime/etc/jetty-http.xml >> '<Set name="port"><Property name="jetty.port" default="8080" /></Set>'
   Можно настроить порт на которм будет запускаться сервер приложений 'Jetty'. В 'Google AppEngine Dev Server', в поле 'Port' прописать '8082'
   По дефолту доступ к веб-админке этого сервера приложений 'Jetty': [http://localhost:8082/_ah/admin](http://localhost:8082/_ah/admin)
6. Запускаем это GWT-приложение.
   Оно будет заущено на локальном хосте ('Jetty') который мы предварительно настроили:
   В 'GWT Configuration', в поле 'Start page' прописать 'MySampleApplication2.html'
   (например: [http://127.0.0.1:8889/MySampleApplication2.html](http://127.0.0.1:8889/MySampleApplication2.html))
   
7. Как и любой друной сервлет (серверная часть веб-приложения), в GWT-приложении настраивается карта для сервлета/сервиса в 'web/WEB-INF/web.xml'.
   Собственно именно таким способом сервер пиложений и запускает сервлет/сервис GWT-приложения.
8. Но остальной механизм связки между клиентской и серверной частью веб-приложения генериться автоматом используя инструмент Google Web Toolkit (GWT):
   Для клиентской веб-страницы 'MyApplication...html' генериться JavaScript 'MyApplication...nocache.js', внутри которго лежит сконфигурированный AJAX для доступа к нашему веб-сервису (тот что прописан в карте для сервлета/сервиса в 'web/WEB-INF/web.xml')