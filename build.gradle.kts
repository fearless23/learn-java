plugins {
	java
	id("org.springframework.boot") version "3.1.3"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "jassi"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
	compileOnly("org.projectlombok:lombok:1.18.28")

	implementation("org.springframework.boot:spring-boot-starter:3.1.3")
	implementation("org.springframework.boot:spring-boot-starter-web:3.1.3")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.1.3")
	runtimeOnly("com.mysql:mysql-connector-j:8.1.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.3")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
