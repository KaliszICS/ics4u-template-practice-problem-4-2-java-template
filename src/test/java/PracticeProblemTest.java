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
    @DisplayName("Test getLength method")
    void getLengthTest1() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Method method = rectangleClass.getDeclaredMethod("getLength");
            Object rectangle = createRectangle(5, 4);
            assertEquals(5.0, (double)method.invoke(rectangle), 0.01);
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }
