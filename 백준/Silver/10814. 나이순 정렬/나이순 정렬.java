import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Person implements Comparable<Person> {
    int age;
    String name;
    
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.age, person.age);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        Person[] people = new Person[N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people[i] = new Person(age, name);
        }
        
        Arrays.sort(people);
        
        for(int i=0; i<N; i++) {
        	System.out.println(people[i].age + " " + people[i].name);
        }
    }
}
