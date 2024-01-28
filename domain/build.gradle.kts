plugins {
    id("zelda.java-common-conventions")
}

dependencies {
    implementation (libs.springBootStarterDataJpa)
    implementation ("org.hibernate:hibernate-validator:8.0.0.Final")

    val mapstructVersion = "1.5.3.Final" // MapStruct 버전을 직접 지정
    implementation("org.mapstruct:mapstruct:$mapstructVersion")
    annotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")
    //annotationProcessor ("org.projectlombok:lombok-mapstruct-binding:0.2.0'")


    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    runtimeOnly(libs.h2)
    testImplementation(libs.h2)
}
