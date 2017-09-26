package boardannotation;


public class BoardVO {
	int seq;
	String title;
	String contents;
	String writer;
	
	public String toString(){
		return "게시물번호="+seq+ ",제목="+title
		+",내용="+contents + ",작성자=" + writer;		
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
