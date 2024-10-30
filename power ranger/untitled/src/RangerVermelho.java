public class RangerVermelho extends Ranger{

    @Override
    public void morfarComArmadura() {
        super.morfarComArmadura();
        System.out.println("blindagem animarium");
    }


    @Override
    public void morfarComArmaEArmadura() {
        super.morfarComArmaEArmadura();
        System.out.println("Armadura animal: blindagem animarium!!");
        System.out.println("Arma animal: Garra de Cervo!!");
    }
}
