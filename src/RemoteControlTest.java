/**
 * Created by Тим on 04.06.2017.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();

        LightOnCommand lightOn = new LightOnCommand(light);


        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}