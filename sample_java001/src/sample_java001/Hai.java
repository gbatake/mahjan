package sample_java001;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Hai {

	public Button button = new Button();
	public ImageView imgView = new ImageView();
	public String selectHaiId = "";
	public String imagePass = "";

	//setter,getter
	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public ImageView getImgView() {
		return imgView;
	}

	public void setImgView(ImageView imgView) {
		this.imgView = imgView;
	}

	public String getSelectHaiId() {
		return selectHaiId;
	}

	public void setSelectHaiId(String selectHaiId) {
		this.selectHaiId = selectHaiId;
	}

	public String getImagePass() {
		return imagePass;
	}

	public void setImagePass(String imagePass) {
		this.imagePass = imagePass;
	}


	public void selectHai(Button button,ImageView imgView, String selectHaiId,String imagePass) {
		setButton(button);
		setImgView(imgView);
		setSelectHaiId(selectHaiId);
		setImagePass(imagePass);

		Image image = new Image(imagePass);
		imgView.setImage(image);

	}

}
