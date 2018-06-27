import sun.audio.*;
import java.io.*;

public class MusicPlayer {


    AudioPlayer player = AudioPlayer.player;
 AudioStream Sound;
 AudioData soundData;
 ContinuousAudioDataStream loop = null;
 String file;

 MusicPlayer(String fileName){
file = fileName;

 }
 public void Start(){
     try {
         Sound = new AudioStream(new FileInputStream(file));
         soundData = Sound.getData();
         loop = new ContinuousAudioDataStream(soundData);
     }
     catch(IOException Error) {
         player.start(loop);
     }
 }
 public void Stop(){
     try {
         Sound = new AudioStream(new FileInputStream(file));
         soundData = Sound.getData();
         loop = new ContinuousAudioDataStream(soundData);
     }
     catch(IOException Error) {
         player.stop(loop);
     }
 }

}
