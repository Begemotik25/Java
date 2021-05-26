package Lab1_2;

public class Fifth {
    //Створіть метод який дозволяє фільтрувати елементи будь якого масиву int та виводити ці елементи на консоль.
    // Умови фільтрації повинні передаватися в метод як параметр. Використовуйте функціональні інтерфейси та анонимні класи.
    @FunctionalInterface
    interface FilterForArray{
        public void startFilter();
    }
    public void filter(FilterForArray filter){
        filter.startFilter();
    }
    public static void main(String[] args) {
            Fifth f = new Fifth();
            int [] arr = {8,12,35,4,15};
            FilterForArray minValue = new FilterForArray() {
                @Override
                public void startFilter() {
                    int minValueOfArr = arr[0];
                    for (int i : arr) {
                        if(minValueOfArr > i){
                            minValueOfArr = i;
                        }
                    }
                    System.out.println(minValueOfArr);
                }
            };
            FilterForArray maxValue = new FilterForArray() {
                @Override
                public void startFilter() {
                    int maxValueOfArr = arr[0];
                    for (int i : arr) {
                        if (maxValueOfArr < i){
                            maxValueOfArr = i;
                        }
                    }
                    System.out.println(maxValueOfArr);
                }
            };
            f.filter(maxValue);
            f.filter(minValue);
        }
    }


