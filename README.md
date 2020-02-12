necvn.udemy.com
sangtt@nec.vn
MetRoiNha0418 
# 2359test
Code assignment Java developer v2.0
Welcome to the code assignment of Singtel. You are expected to spend 1 to 1.5 hours on
the assignment. If you run out of time, please submit the results as far as you got within this
amount of time. We value quality over quantity.
Please create a repository in Github and share the link with results. To set the correct
expectations: There is no “right” or “wrong” answer. We would like to see how you model
the objects in the assignment and learn your coding style. Stay close to how you would code
if this were an assignment in your regular day job.
Furthermore:
• Please keep a fine grained commit history with separate commits for each question.
• Please create meaningful Unit Tests.
• Please modify the code snippets provided to optimize for maintainability. Be aware
that the code snippets are deliberately flawed. We like to see you improve them.
• A README.md with basic documentation and a simple visualisation is appreciated. A
picture of a whiteboard or drawing on a paper is sufficient here.
• You are encouraged to be opinionated how you solve this. Show us your way of
working! Take creative liberty where you feel it is needed.
A. Let’s start with the basics
Given the following code...
class Animal {
void walk(){
System.out.println("I am walking");
}
}
class Bird extends Animal {
void fly() {
System.out.println("I am flying");
}
}
public class Solution {
public static void main(String[] args) {
Bird bird = new Bird();
bird.walk();
bird.fly();
bird.sing();
}
}
1. Can you implement the sing() method for the bird? FINISHED
a. How did you unit test it?
b. How did you optimize the code for maintainability?
(Ask yourself the same question for all following exercises)

2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound? FINISHED
a. A duck says: “Quack, quack”
b. A duck can swim
c. A chicken says: “Cluck, cluck”
d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
3. Now how would you model a rooster? FINISHED
a. A rooster says: “Cock-a-doodle-doo”
b. How is the rooster related to the chicken?
c. Can you think of other ways to model a rooster without using inheritance?
4. Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster. FINISHED
a. A parrot living with dogs says: “Woof, woof”
b. A parrot living with cats says: “Meow”
c. A parrot living near the rooster says: “Cock-a-doodle-doo”
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?

B. Model fish as well as other swimming animals
1. In addition to the birds, can you model a fish? FINISHED
a. Fishes don’t sing
b. Fishes don’t walk
c. Fishes can swim
2. Can you specialize the fish as a Shark and as a Clownfish? FINISHED
a. Sharks are large and grey
b. Clownfish are small and colourful (orange)
c. Clownfish make jokes
d. Sharks eat other fish
3. Dolphins are not exactly fish, yet, they are good swimmers FINISHED
a. Can you model a dolphin that swims without inheriting from a fish class?
b. How do you avoid duplicating code or introducing unneeded overhead?

D. Model animals that change their behaviour over time
1. Can you model a butterfly? FINISHED
a. A butterfly can fly
b. A butterfly does not make a sound

2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly? FINISHED
a. A caterpillar cannot fly
b. A caterpillar can walk (crawl)

E. Counting animals
Suppose you have an array of animals, e.g.
Animal[] animals = new Animal[]{
new Bird(),
new Duck(),
new Chicken(),
new Rooster(),
new Parrot(),
new Fish(),
new Shark(),
new Clownfish(),
new Dolhpin(),
new Frog(),
new Dog(),
new Butterfly(),
new Cat()
};
Note: The above instantiation may be different if you chose to set up your object model
differently... (hopefully you did)
1. Can you share the code to count: FINISHED
a. how many of these animals can fly?
b. how many of these animals can walk?
c. how many of these animals can sing?
d. how many of these animals can swim?

BONUS
If you still have time left, please consider the following:
1. Can you add a second language (if you know a language other than English) Use the
rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds
differently depending on language. Please add the rooster sound in your native
tongue. FINISHED

• Danish: kykyliky
• Dutch: kukeleku
• Finnish: kukko kiekuu
• French: cocorico
• German: kikeriki
• Greek: kikiriki

• Hebrew: coo-koo-ri-koo
• Hungarian: kukuriku
• Italian: chicchirichi
• Japanese: ko-ke-kok-ko-o
• Portuguese: cucurucu
• Russian: kukareku
• Swedish: kuckeliku
• Turkish: kuk-kurri-kuuu
• Urdu: kuklooku

2. Can you design a RESTful API for querying these animals? FINISHED
