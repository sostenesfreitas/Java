package futebol.relatorio;

public class TimeMediaSalarial {

	private String nomeTime;
	private Double mediaSalarial;
	
	public TimeMediaSalarial(String nomeTime, Double mediaSalarial) {
		super();
		this.nomeTime = nomeTime;
		this.mediaSalarial = mediaSalarial;
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public Double getMediaSalarial() {
		return mediaSalarial;
	}
	public void setMediaSalarial(Double mediaSalarial) {
		this.mediaSalarial = mediaSalarial;
	}
	@Override
	public String toString() {
		return "TimeMediaSalarial [nomeTime=" + nomeTime + ", mediaSalarial="
				+ mediaSalarial + "]";
	}
	
}
