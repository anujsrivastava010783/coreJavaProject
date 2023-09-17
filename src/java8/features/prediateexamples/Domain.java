package java8.features.prediateexamples;

public class Domain {
	
	private String name;
    private Integer score;
    
	public Domain(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Domain [name=" + name + ", score=" + score + "]";
	}
}
