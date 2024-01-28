plugins {
    id("zelda.java-application-web-conventions")
    id("io.spring.dependency-management") version "1.1.4"
}

dependencies{
    // domain 모듈에 대한 의존성 추가
    implementation(project(":domain"))

    implementation(libs.springBootStarterWeb)
    compileOnly(libs.lombok)

    annotationProcessor(libs.lombok)
    testImplementation(libs.springBootStarterTest)

}

