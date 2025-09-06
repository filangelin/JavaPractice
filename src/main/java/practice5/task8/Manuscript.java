package practice5.task8;

public class Manuscript extends Exhibit {
    @Override
    void showHistory() {
        System.out.println("Манускрипт  - древний текст");
    }

    @Override
    void care() {
        System.out.println("Манускрипт — требует контролируемой влажности");
    }
}
