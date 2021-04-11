package lesson04.home;

public class HW04 {

    public static void main(String[] args) {

        Collaborator mainCollaborator = new Collaborator("Татьяна", "Алексеевна", "Малышева",
                "Комплаенс офицер",
                "8(915)121-29-99",
                100000,
                1986);

        System.out.println("4: Hello " +
                        mainCollaborator.getName() + " " + mainCollaborator.getSecondName() + " " + mainCollaborator.getSurname() +
                ", " + mainCollaborator.getPosition() + ".");

        Collaborator[] collaborators = {
                mainCollaborator,
                new Collaborator("Елена", "Валерьевна",
                        "Зазай", "Руководитель",
                        "8(495)111-22-33", 200000, 1973),
                new Collaborator("Ольга", "Валерьевна",
                        "Григорьева", "Заместитель руководителя",
                        "8(495)222-33-44", 140000, 1980),
                new Collaborator("Ольга", "Викторовна",
                        "Гостева", "Главный специалист",
                        "8(495)333-44-55", 110000, 1968),
                new Collaborator("Мария", "Евгеньевна",
                        "Антонова", "Специалист",
                        "8(495)444-55-66", 80000, 1995)
        };

        System.out.println("5:");

        for (int i = 0; i < collaborators.length; i++)
            if (collaborators[i].getAge() > 40) {
                System.out.println(collaborators[i].getFullInfo());
            }
    }

}
