// 音乐播放程序


import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {

    public void play(){

        try {
            // 将MIDI 信息组合成“乐曲”
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a sequencer ");
        }
        catch (MidiUnavailableException ex){
            System.out.println("Bummer");
        }
    } // 关闭播放

    public static void main(String[] args){
        MusicTest1 mt = new MusicTest1();
        mt.play();
    } // 关闭main
} // 关闭类
