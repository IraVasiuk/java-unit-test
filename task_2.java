@Test // Напиши код здесь
public void checkIsAdultWhenAgeIsLessThan18False() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(17);
    assertEquals("Должно вернуться false, так как пользователь совершеннолетний", false, isAdult);   
}