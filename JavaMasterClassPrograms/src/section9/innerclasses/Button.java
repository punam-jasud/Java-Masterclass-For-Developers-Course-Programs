package section9.innerclasses;

public class Button {
	
	private String titleString;
	private OnClickListener onClickListerner;
	
	public Button(String titleString) {
		this.titleString = titleString;
	}
	
	public String getTitleString() {
		return titleString;
	}
	
	public void setOnClickListerner(OnClickListener onClickListerner) {
		this.onClickListerner = onClickListerner;
	}
	public void onClick() {
		this.onClickListerner.onClick(this.titleString);
	}
	
	public interface OnClickListener{
		public void onClick(String titleString);
	}
}
