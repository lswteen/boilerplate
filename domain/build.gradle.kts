plugins {
    id("zelda.java-common-conventions")
}

dependencies {
    implementation (libs.springBootStarterDataJpa)
    implementation ("org.hibernate:hibernate-validator:8.0.0.Final")

    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    runtimeOnly(libs.h2)
    testImplementation(libs.h2)
}
