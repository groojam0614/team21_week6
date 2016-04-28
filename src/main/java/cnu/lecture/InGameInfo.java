package cnu.lecture;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by tchi on 2016. 4. 25..
 */
public class InGameInfo {
    public static class Observer {
        @Getter @Setter
        private String encryptionKey;

		public String getEncryptionKey() {
			// TODO Auto-generated method stub
			return this.encryptionKey;
		}
    }

    public static class Participant {
        @Getter @Setter
        private String summonerName;

		public String getSummonerName() {
			// TODO Auto-generated method stub
			return this.summonerName;
		}
    }

    @Getter @Setter
    private String platformId;

    @Getter @Setter
    private Observer observers;

    @Getter @Setter
    private Participant[] participants;

	public Participant[] getParticipants() {
		// TODO Auto-generated method stub
		return this.participants;
	}

	public Observer getObservers() {
		// TODO Auto-generated method stub
		return this.observers;
	}
}
