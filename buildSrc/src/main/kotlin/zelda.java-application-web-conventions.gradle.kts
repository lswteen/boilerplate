plugins{
    id("zelda.java-common-conventions") // <1>
    application
}

application {
    // 여기에 메인 클래스의 정규 이름 지정
    mainClass.set("com.renzo.zelda.ZeldaApplication")
}