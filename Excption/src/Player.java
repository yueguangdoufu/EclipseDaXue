
public class Player {
	
	public void play(int index) throws NoThisSongException {
		if(index > 10) {
			throw new NoThisSongException("您播放的歌曲不存在");
		}
	}

}
