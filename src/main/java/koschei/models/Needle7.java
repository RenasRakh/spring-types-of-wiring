package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private final Deth8 deth;

    @Autowired
    public Needle7(Deth8 deth) {
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}

//В Спринге связать бины можно различными способами, рассмотрим их на примере:
//1) KoscheiTheDeathless связывается с Ocean1 через сеттер setOcean и аннотации @Autowired над ней.
//2) Ocean1 связан с Island2 через поле и аннотацию, которая подтянет бин Island2 через метод getIsland()
// в классе AppConfig. Обратите внимание, что данный метод обозначен аннотацией @Bean, что автоматически подтягивает
// аргументы в метод. В качестве аргумента выступает бин Wood3.
//3) Бин Wood3 помечен как компонент, который конструируется через связывание по @Autowired с помощью конструктора.
//
//Задание:
//Собрать цепочку до 8го элемента, использовав все вышеперечисленные методы связывания.
// После выполнения вы должны получить полную фразу. Проверьте своё решение тестом из заготовки.
