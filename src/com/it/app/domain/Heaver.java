package com.it.app.domain;

public class Heaver extends Employee {

    private Integer bonus;

    @Override
    public String toString() {
        return "Heaver{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", bonus=" + getBonus() +
                '}';
    }

    public Heaver(Long id, String name, Integer age, Integer salary, Integer bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public Heaver() {
        super();
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

}
