plugins {
    id("zelda.java-application-web-conventions")
}

dependencies{
    implementation(libs.springBootStarterWeb)
    compileOnly(libs.lombok)
    //runtimeOnly("com.h2database:h2")
    annotationProcessor(libs.lombok)
    testImplementation(libs.springBootStarterTest)
}

