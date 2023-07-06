package u4d9;

public class App {

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
//		Supplier<Integer> intSupplier = () -> {
//			Random rndm = new Random();
//			return rndm.nextInt(1, 100);
//		};
//		
//		Supplier<Student> studentsSupplier = () -> {
//			return new Student("Aldo", "Baglio", 20, intSupplier.get());
//		};
//
//		List<Student> students = new ArrayList<>();
//
//		for (int i = 0; i < 100; i++) {
//			students.add(studentsSupplier.get());
//		}
//
//		students.forEach(i -> System.out.println(i));

//
//		List<Integer> interi = new ArrayList<>();
//
//		for (int i = 0; i < 100; i++) {
//			interi.add(intSupplier.get());
//		}
//
//		interi.forEach(i -> System.out.println(i));


	}
}
