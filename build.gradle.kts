plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation group: 'com.opencsv', name: 'opencsv', version: '5.1'
    implementation group: 'com.googlecode.json-simple', name: 'json-simple', version: '1.1.1'
    implementation group: 'com.google.code.gson', name: 'gson', version: '2.8.2'
}

tasks.test {
    useJUnitPlatform()
}