plugins {
    application
}

application {
    mainClass.set("example.Example")
}

group = "org.lombok-extension-method-test"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok:1.18.22")
}