package u4d9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.javafaker.Faker;

import u4d9.entities.Student;

public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
//		new Thread(new Runnable() {
//			public void run() {
//				for (int i = 0; i <= 10; i++) {
//					System.out.println(Thread.currentThread().getName() + " i:" + i);
//				}
//			}
//		}).start();
//
//		new Thread(() -> {
//			// La Lambda function qua implementa il metodo run di Runnable
//			for (int i = 0; i < 100; i++) {
//				System.out.println(i);
//				try {
//					Thread.sleep(5);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}).start();
//
//		Runnable r1 = () -> {
//			System.out.println("Ciao sono il metodo run");
//		};
//
//		new Thread(r1).start();

//		Random rndm = new Random();
//
//		Student aldo = new Student("Aldo", "Baglio", 20, rndm.nextInt());
//		Student giovanni = new Student("Giovanni", "Storti", 30, rndm.nextInt());
//		Student giacomo = new Student("Giacomo", "Poretti", 40, rndm.nextInt());
//
//		List<Student> students = new ArrayList<>();
//		students.add(aldo);
//		students.add(giovanni);
//		students.add(giacomo);
//		Collections.sort(students, (s1, s2) -> s2.getAge() - s1.getAge());

//		Collections.sort(students, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student s1, Student s2) {
//				// TODO Auto-generated method stub
//				return s2.getAge() - s1.getAge();
//			}
//
//		});

//		students.forEach(s -> System.out.println(s));
//
//		for (Student s : students) {
//			System.out.println(s);
//		}

		// ******* FUNCTIONAL INTERFACE CUSTOM ****
//
		
//		StringModifier wrapper = s -> "***" + s + "***";
//
//		StringModifier invert = s -> {
//			String[] c = s.split("");
//			String inverted = "";
//			for (int i = c.length - 1; i >= 0; i--) {
//				inverted += c[i];
//			}
//			return inverted;
//		};
//
//		System.out.println(wrapper.modify("CIAO"));
//		System.out.println(invert.modify("CIAO"));

		// ************************ PREDICATES *****************
//		Predicate<Integer> isMoreThanZero = n -> n > 0;
//		Predicate<Integer> isLessThanHundred = n -> n < 100;
//		System.out.println(isMoreThanZero.test(aldo.getAge()));
//		System.out.println(isLessThanHundred.test(aldo.getAge()));
//		Predicate<Integer> isBetweenZeroAndHundred = isMoreThanZero.and(isLessThanHundred);
//		System.out.println(isBetweenZeroAndHundred.test(aldo.getAge()));
//		System.out.println(isMoreThanZero.negate().test(aldo.getAge()));

		// ************************ SUPPLIER ******************
		Supplier<Integer> intSupplier = () -> {
			Random rndm = new Random();
			return rndm.nextInt(1, 100);
		};
		Faker f = new Faker(Locale.ITALY);
//		
		Supplier<Student> studentsSupplier = () -> {
			return new Student(f.name().firstName(), f.name().lastName(), intSupplier.get(), intSupplier.get());
		};
//
		List<Student> students = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			System.out.println(f.address().fullAddress());
			students.add(studentsSupplier.get());
		}

		students.forEach(i -> System.out.println(i));

//
//		List<Integer> interi = new ArrayList<>();
//
//		for (int i = 0; i < 100; i++) {
//			interi.add(intSupplier.get());
//		}
//
//		interi.forEach(i -> System.out.println(i));

		// ********************************** STREAMS ****************************

//		Supplier<Integer> intSupplier = () -> {
//			Random rndm = new Random();
//			return rndm.nextInt(1, 100);
//		};


//		List<Integer> interi = new ArrayList<>();
//		for (int i = 0; i < 100; i++) {
//			interi.add(intSupplier.get());
//		}
//
//		Predicate<Integer> isLessThan20 = n -> n < 20;
//		Predicate<Integer> isGreaterThan10 = n -> n > 10;
//
////		List<Integer> numbersBetween10And20 = interi.stream().filter(isLessThan20.and(isGreaterThan10)).toList();
////
////		numbersBetween10And20.forEach(i -> System.out.println(i));
//
//		List<String> mappedNumbers = interi.stream().filter(isLessThan20.and(isGreaterThan10))
//				.map(num -> "Numero:" + num).toList();
//		mappedNumbers.forEach(n -> System.out.println(n));

//		Supplier<Student> studentsSupplier = () -> {
//			Random rndm = new Random();
//
//			return new Student("Aldo", "Baglio", intSupplier.get(), rndm.nextInt());
//		};
//
//		List<Student> students = new ArrayList<>();
//
//		for (int i = 0; i < 100; i++) {
//			students.add(studentsSupplier.get());
//		}
//
//		 int totalAge = students.stream().map(s -> s.getAge()).reduce(0, (acc, curr)
//		 -> acc + curr);
//
////		int totalAge = students.stream().map(Student::getAge).reduce(0, (acc, curr) -> acc + curr);
//		System.out.println(totalAge);
//
//		List<String> youngStudents = students.stream().filter(student -> student.getAge() < 18)
//				.map(student -> student.getSurname()).toList();
//
//		youngStudents.forEach(s -> System.out.println(s));
//
//		if (students.stream().allMatch(student -> student.getAge() >= 18)) {
//			System.out.println("Tutti gli studenti sono maggiorenni");
//		} else {
//			System.out.println("C'è qualche minorenne");
//		}
//
//		if (students.stream().anyMatch(student -> student.getAge() == 18)) {
//			System.out.println("C'è almeno uno studente con 18 anni");
//		}

//		List<? extends Student> list = new ArrayList<>(); // Generics con tipo unknown

		// ************************************* LOCAL DATES ******************
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate tomorrow = today.plusDays(1);
		System.out.println(tomorrow);

		LocalDate yesterday = today.minusDays(1);
		System.out.println(yesterday);

		System.out.println(yesterday.isBefore(today));



	}
}
