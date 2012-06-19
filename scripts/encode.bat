rem this file is used to encode russian characters to ascii codes in the bundle file
"%JAVA_HOME%\bin\native2ascii" -encoding utf8 ./src/main/resources/messages_ru_origin.properties ./src/main/resources/messages_ru.properties
