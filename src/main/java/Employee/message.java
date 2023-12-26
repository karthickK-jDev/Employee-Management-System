package Employee;

public class message {
	private String content;
	private String type;
	private String style;
	public message(String content, String type, String style) {
		super();
		this.content = content;
		this.type = type;
		this.style = style;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	
}
