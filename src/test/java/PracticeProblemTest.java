import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

private Object createDog(String name, String breed, int weight) {
        try {
            Class<?> dogClass = Class.forName("Dog");
            Constructor<?> constructor = dogClass.getConstructor(String.class, String.class, int.class);
            return constructor.newInstance(name, breed, weight);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Rectangle constructor with (double, double) parameters does not exist");
        } catch (Exception e) {
            fail("Error creating Rectangle instance: " + e.getMessage());
        }
        return null; // This won't be reached due to fail() calls above
    }

    private Object createCar(String make, String model, int year, double price) {
        try {
            Class<?> carClass = Class.forName("Car");
            Constructor<?> constructor = carClass.getConstructor(String.class, String.class, int.class, double.class);
            return constructor.newInstance(make, model, year, price);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Rectangle constructor with (double, double) parameters does not exist");
        } catch (Exception e) {
            fail("Error creating Rectangle instance: " + e.getMessage());
        }
        return null; // This won't be reached due to fail() calls above
    }

    @Test
    @DisplayName("")
    void dogGetNameTest1() {
        try {
            Class<?> dogClass = Class.forName("Dog");
            Method method = dogClass.getDeclaredMethod("getName");
            Object dog = createDog("Snoopy", "Mutt", 105);
            assertEquals("Snoopy", (String)method.invoke(dog));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

        @Test
    @DisplayName("")
    void dogGetBreedTest1() {
        try {
            Class<?> dogClass = Class.forName("Dog");
            Method method = dogClass.getDeclaredMethod("getBreed");
            Object dog = createDog("Snoopy", "Mutt", 105);
            assertEquals("Mutt", (String)method.invoke(dog));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void dogGetWeightTest1() {
        try {
            Class<?> dogClass = Class.forName("Dog");
            Method method = dogClass.getDeclaredMethod("getWeight");
            Object dog = createDog("Snoopy", "Mutt", 105);
            assertEquals(105, (int)method.invoke(dog), 0.01);
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

 @Test
    @DisplayName("")
    void dogGetNameTest2() {
        try {
            Class<?> dogClass = Class.forName("Dog");
            Method method = dogClass.getDeclaredMethod("getName");
            Object dog = createDog("Fido", "Poodle", 15);
            assertEquals("Fido", (String)method.invoke(dog));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

        @Test
    @DisplayName("")
    void dogGetBreedTest2() {
        try {
            Class<?> dogClass = Class.forName("Dog");
            Method method = dogClass.getDeclaredMethod("getBreed");
            Object dog = createDog("Fido", "Poodle", 15);
            assertEquals("Poodle", (String)method.invoke(dog));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void dogGetWeightTest2() {
        try {
            Class<?> dogClass = Class.forName("Dog");
            Method method = dogClass.getDeclaredMethod("getWeight");
            Object dog = createDog("Fido", "Poodle", 15);
            assertEquals(15, (int)method.invoke(dog), 0.01);
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void dogsetNameTest() {
        try {
            Class<?> dogClass = Class.forName("Dog");
            Method method = dogClass.getDeclaredMethod("getName");
        Method setMethod = dogClass.getDeclaredMethod("setName");
            Object dog = createDog("Fido", "Poodle", 15);
        setMethod.invoke(dog, "Monty");
            assertEquals("Monty", (String)method.invoke(dog));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void dogSetBreedTest() {
        try {
            Class<?> dogClass = Class.forName("Dog");
            Method method = dogClass.getDeclaredMethod("getBreed");
        Method setMethod = dogClass.getDeclaredMethod("setBreed");
            Object dog = createDog("Fido", "Poodle", 15);
        setMethod.invoke(dog, "Labrador");
            assertEquals("Labrador", (String)method.invoke(dog));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void dogSetWeightTest() {
        try {
            Class<?> dogClass = Class.forName("Dog");
            Method method = dogClass.getDeclaredMethod("getWeight");
        Method setMethod = dogClass.getDeclaredMethod("setWeight");
            Object dog = createDog("Fido", "Poodle", 15);
        setMethod.invoke(dog, 55);
            assertEquals(55, (int)method.invoke(dog));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("")
    void carGetMakeTest1() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getMake");
            Object car = createCar("Toyota", "Camry", 1985, 30000.99);
            assertEquals("Toyota", (String)method.invoke(car));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void carGetModelTest1() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getModel");
            Object car = createCar("Toyota", "Camry", 1985, 30000.99);
            assertEquals("Camry", (String)method.invoke(car));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void carGetYearTest1() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getYear");
            Object car = createCar("Toyota", "Camry", 1985, 30000.99);
            assertEquals(1985, (int)method.invoke(car));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void carGetPriceTest1() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getPrice");
            Object car = createCar("Toyota", "Camry", 1985, 30000.99);
            assertEquals(30000.99, (double)method.invoke(car), 0.01);
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("")
    void carGetMakeTest2() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getMake");
            Object car = createCar("Audi", "A4", 2020, 49999.99);
            assertEquals("Audi", (String)method.invoke(car));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void carGetModelTest2() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getModel");
            Object car = createCar("Audi", "A4", 2020, 49999.99);
            assertEquals("A4", (String)method.invoke(car));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void carGetYearTest2() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getYear");
            Object car = createCar("Audi", "A4", 2020, 49999.99);
            assertEquals(2020, (int)method.invoke(car));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void carGetPriceTest2() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getPrice");
            Object car = createCar("Audi", "A4", 2020, 49999.99);
            assertEquals(49999.99, (double)method.invoke(car), 0.01);
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void carGetPriceTest() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getPrice");
                 Method setMethod = carClass.getDeclaredMethod("setPrice");
            Object car = createCar("Audi", "A4", 2020, 49999.99);
                setMethod.invoke(car, 1);
            assertEquals(1.0, (double)method.invoke(car), 0.01);
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void carSetPriceTest() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getPrice");
                 Method setMethod = carClass.getDeclaredMethod("setPrice");
            Object car = createCar("Audi", "A4", 2020, 49999.99);
                setMethod.invoke(car, 1);
            assertEquals(1.0, (double)method.invoke(car), 0.01);
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void carSetMakeTest() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getMake");
                 Method setMethod = carClass.getDeclaredMethod("setMake");
            Object car = createCar("Audi", "A4", 2020, 49999.99);
                setMethod.invoke(car, "Hyundai");
            assertEquals("Hyundai", (String)method.invoke(car));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void carSetModelTest() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getModel");
                 Method setMethod = carClass.getDeclaredMethod("setModel");
            Object car = createCar("Audi", "A4", 2020, 49999.99);
                setMethod.invoke(car, "Jetta");
            assertEquals("Jetta", (String)method.invoke(car));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }

@Test
    @DisplayName("")
    void carSetYearTest() {
        try {
            Class<?> carClass = Class.forName("Car");
            Method method = carClass.getDeclaredMethod("getYear");
                 Method setMethod = carClass.getDeclaredMethod("setYear");
            Object car = createCar("Audi", "A4", 2020, 49999.99);
                setMethod.invoke(car, 2000);
            assertEquals(2000, (int)method.invoke(car));
        } catch (ClassNotFoundException e) {
            fail("class does not exist");
        } catch (NoSuchMethodException e) {
            fail("method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }
}
