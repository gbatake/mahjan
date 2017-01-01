package sample_java001;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SelectController implements Initializable {

	@FXML Button bt_man1 = new Button();
	@FXML Button bt_man2 = new Button();
	@FXML Button bt_man3 = new Button();
	@FXML ImageView imv_man1 = new ImageView();
	@FXML ImageView imv_man2 = new ImageView();
	@FXML ImageView imv_man3 = new ImageView();

	private String[] param = new String[100];
	Param pset = new Param();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Image im_man1 = new Image("image/image_man1.png");
		Image im_man2 = new Image("image/image_man2.png");
		Image im_man3 = new Image("image/image_man3.png");

		imv_man1.setImage(im_man1);
		imv_man2.setImage(im_man2);
		imv_man3.setImage(im_man3);

	}

	@FXML
	public void bt_man1_OnMouseClicked(){
		param[0] = "image_man1.png";
		pset.setParam(param);



	}
	@FXML
	public void bt_man1_OnMouseClicked1(ActionEvent event){
		System.out.println("aaa");

		param[0] = "image_man1.png";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

}
