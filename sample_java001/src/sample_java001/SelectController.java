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
	@FXML Button bt_man4 = new Button();
	@FXML Button bt_man5 = new Button();
	@FXML Button bt_man6 = new Button();
	@FXML Button bt_man7 = new Button();
	@FXML Button bt_man8 = new Button();
	@FXML Button bt_man9 = new Button();
	@FXML Button bt_pin1 = new Button();
	@FXML Button bt_pin2 = new Button();
	@FXML Button bt_pin3 = new Button();
	@FXML Button bt_pin4 = new Button();
	@FXML Button bt_pin5 = new Button();
	@FXML Button bt_pin6 = new Button();
	@FXML Button bt_pin7 = new Button();
	@FXML Button bt_pin8 = new Button();
	@FXML Button bt_pin9 = new Button();
	@FXML Button bt_sou1 = new Button();
	@FXML Button bt_sou2 = new Button();
	@FXML Button bt_sou3 = new Button();
	@FXML Button bt_sou4 = new Button();
	@FXML Button bt_sou5 = new Button();
	@FXML Button bt_sou6 = new Button();
	@FXML Button bt_sou7 = new Button();
	@FXML Button bt_sou8 = new Button();
	@FXML Button bt_sou9 = new Button();
	@FXML Button bt_ton = new Button();
	@FXML Button bt_nan = new Button();
	@FXML Button bt_sha = new Button();
	@FXML Button bt_pei = new Button();
	@FXML Button bt_haku = new Button();
	@FXML Button bt_hatu = new Button();
	@FXML Button bt_chun = new Button();

	@FXML ImageView imv_man1 = new ImageView();
	@FXML ImageView imv_man2 = new ImageView();
	@FXML ImageView imv_man3 = new ImageView();
	@FXML ImageView imv_man4 = new ImageView();
	@FXML ImageView imv_man5 = new ImageView();
	@FXML ImageView imv_man6 = new ImageView();
	@FXML ImageView imv_man7 = new ImageView();
	@FXML ImageView imv_man8 = new ImageView();
	@FXML ImageView imv_man9 = new ImageView();
	@FXML ImageView imv_pin1 = new ImageView();
	@FXML ImageView imv_pin2 = new ImageView();
	@FXML ImageView imv_pin3 = new ImageView();
	@FXML ImageView imv_pin4 = new ImageView();
	@FXML ImageView imv_pin5 = new ImageView();
	@FXML ImageView imv_pin6 = new ImageView();
	@FXML ImageView imv_pin7 = new ImageView();
	@FXML ImageView imv_pin8 = new ImageView();
	@FXML ImageView imv_pin9 = new ImageView();
	@FXML ImageView imv_sou1 = new ImageView();
	@FXML ImageView imv_sou2 = new ImageView();
	@FXML ImageView imv_sou3 = new ImageView();
	@FXML ImageView imv_sou4 = new ImageView();
	@FXML ImageView imv_sou5 = new ImageView();
	@FXML ImageView imv_sou6 = new ImageView();
	@FXML ImageView imv_sou7 = new ImageView();
	@FXML ImageView imv_sou8 = new ImageView();
	@FXML ImageView imv_sou9 = new ImageView();
	@FXML ImageView imv_ton = new ImageView();
	@FXML ImageView imv_nan = new ImageView();
	@FXML ImageView imv_sha = new ImageView();
	@FXML ImageView imv_pei = new ImageView();
	@FXML ImageView imv_haku = new ImageView();
	@FXML ImageView imv_hatu = new ImageView();
	@FXML ImageView imv_chun = new ImageView();

	//画像ファイル名
	String filename_man1 = "image/image_man1.png";
	String filename_man2 = "image/image_man2.png";
	String filename_man3 = "image/image_man3.png";
	String filename_man4 = "image/image_man4.png";
	String filename_man5 = "image/image_man5.png";
	String filename_man6 = "image/image_man6.png";
	String filename_man7 = "image/image_man7.png";
	String filename_man8 = "image/image_man8.png";
	String filename_man9 = "image/image_man9.png";
	String filename_pin1 = "image/image_pin1.png";
	String filename_pin2 = "image/image_pin2.png";
	String filename_pin3 = "image/image_pin3.png";
	String filename_pin4 = "image/image_pin4.png";
	String filename_pin5 = "image/image_pin5.png";
	String filename_pin6 = "image/image_pin6.png";
	String filename_pin7 = "image/image_pin7.png";
	String filename_pin8 = "image/image_pin8.png";
	String filename_pin9 = "image/image_pin9.png";
	String filename_sou1 = "image/image_sou1.png";
	String filename_sou2 = "image/image_sou2.png";
	String filename_sou3 = "image/image_sou3.png";
	String filename_sou4 = "image/image_sou4.png";
	String filename_sou5 = "image/image_sou5.png";
	String filename_sou6 = "image/image_sou6.png";
	String filename_sou7 = "image/image_sou7.png";
	String filename_sou8 = "image/image_sou8.png";
	String filename_sou9 = "image/image_sou9.png";
	String filename_haku = "image/image_ji_haku.png";
	String filename_hatu = "image/image_ji_hatu.png";
	String filename_chun = "image/image_ji_chun.png";
	String filename_ton = "image/image_ji_ton.png";
	String filename_nan = "image/image_ji_nan.png";
	String filename_sha = "image/image_ji_sha.png";
	String filename_pei = "image/image_ji_pei.png";

	private String[] param = new String[100];
	Param pset = new Param();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Image image_man1 = new Image(filename_man1);
		Image image_man2 = new Image(filename_man2);
		Image image_man3 = new Image(filename_man3);
		Image image_man4 = new Image(filename_man4);
		Image image_man5 = new Image(filename_man5);
		Image image_man6 = new Image(filename_man6);
		Image image_man7 = new Image(filename_man7);
		Image image_man8 = new Image(filename_man8);
		Image image_man9 = new Image(filename_man9);
		Image image_pin1 = new Image(filename_pin1);
		Image image_pin2 = new Image(filename_pin2);
		Image image_pin3 = new Image(filename_pin3);
		Image image_pin4 = new Image(filename_pin4);
		Image image_pin5 = new Image(filename_pin5);
		Image image_pin6 = new Image(filename_pin6);
		Image image_pin7 = new Image(filename_pin7);
		Image image_pin8 = new Image(filename_pin8);
		Image image_pin9 = new Image(filename_pin9);
		Image image_sou1 = new Image(filename_sou1);
		Image image_sou2 = new Image(filename_sou2);
		Image image_sou3 = new Image(filename_sou3);
		Image image_sou4 = new Image(filename_sou4);
		Image image_sou5 = new Image(filename_sou5);
		Image image_sou6 = new Image(filename_sou6);
		Image image_sou7 = new Image(filename_sou7);
		Image image_sou8 = new Image(filename_sou8);
		Image image_sou9 = new Image(filename_sou9);
		Image image_haku = new Image(filename_haku);
		Image image_hatu = new Image(filename_hatu);
		Image image_chun = new Image(filename_chun);
		Image image_ton = new Image(filename_ton );
		Image image_nan = new Image(filename_nan );
		Image image_sha = new Image(filename_sha );
		Image image_pei = new Image(filename_pei );

		imv_man1.setImage(image_man1);
		imv_man2.setImage(image_man2);
		imv_man3.setImage(image_man3);
		imv_man4.setImage(image_man4);
		imv_man5.setImage(image_man5);
		imv_man6.setImage(image_man6);
		imv_man7.setImage(image_man7);
		imv_man8.setImage(image_man8);
		imv_man9.setImage(image_man9);
		imv_pin1.setImage(image_pin1);
		imv_pin2.setImage(image_pin2);
		imv_pin3.setImage(image_pin3);
		imv_pin4.setImage(image_pin4);
		imv_pin5.setImage(image_pin5);
		imv_pin6.setImage(image_pin6);
		imv_pin7.setImage(image_pin7);
		imv_pin8.setImage(image_pin8);
		imv_pin9.setImage(image_pin9);
		imv_sou1.setImage(image_sou1);
		imv_sou2.setImage(image_sou2);
		imv_sou3.setImage(image_sou3);
		imv_sou4.setImage(image_sou4);
		imv_sou5.setImage(image_sou5);
		imv_sou6.setImage(image_sou6);
		imv_sou7.setImage(image_sou7);
		imv_sou8.setImage(image_sou8);
		imv_sou9.setImage(image_sou9);
		imv_ton.setImage(image_ton);
		imv_nan.setImage(image_nan);
		imv_sha.setImage(image_sha);
		imv_pei.setImage(image_pei);
		imv_haku.setImage(image_haku);
		imv_hatu.setImage(image_hatu);
		imv_chun.setImage(image_chun);

	}

	@FXML
	public void bt_man1_OnMouseClicked(ActionEvent event){

		param[0] = filename_man1;
		param[1] = "man1";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_man2_OnMouseClicked(ActionEvent event){

		param[0] = filename_man2;
		param[1] = "man2";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_man3_OnMouseClicked(ActionEvent event){

		param[0] = filename_man3;
		param[1] = "man3";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_man4_OnMouseClicked(ActionEvent event){

		param[0] = filename_man4;
		param[1] = "man4";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_man5_OnMouseClicked(ActionEvent event){

		param[0] = filename_man5;
		param[1] = "man5";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_man6_OnMouseClicked(ActionEvent event){

		param[0] = filename_man6;
		param[1] = "man6";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_man7_OnMouseClicked(ActionEvent event){

		param[0] = filename_man7;
		param[1] = "man7";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_man8_OnMouseClicked(ActionEvent event){

		param[0] = filename_man8;
		param[1] = "man8";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_man9_OnMouseClicked(ActionEvent event){

		param[0] = filename_man9;
		param[1] = "man9";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_pin1_OnMouseClicked(ActionEvent event){

		param[0] = filename_pin1;
		param[1] = "pin1";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_pin2_OnMouseClicked(ActionEvent event){

		param[0] = filename_pin2;
		param[1] = "pin2";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_pin3_OnMouseClicked(ActionEvent event){

		param[0] = filename_pin3;
		param[1] = "pin3";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_pin4_OnMouseClicked(ActionEvent event){

		param[0] = filename_pin4;
		param[1] = "pin4";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_pin5_OnMouseClicked(ActionEvent event){

		param[0] = filename_pin5;
		param[1] = "pin5";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_pin6_OnMouseClicked(ActionEvent event){

		param[0] = filename_pin6;
		param[1] = "pin6";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_pin7_OnMouseClicked(ActionEvent event){

		param[0] = filename_pin7;
		param[1] = "pin7";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_pin8_OnMouseClicked(ActionEvent event){

		param[0] = filename_pin8;
		param[1] = "pin8";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_pin9_OnMouseClicked(ActionEvent event){

		param[0] = filename_pin9;
		param[1] = "pin9";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_sou1_OnMouseClicked(ActionEvent event){

		param[0] = filename_sou1;
		param[1] = "sou1";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_sou2_OnMouseClicked(ActionEvent event){

		param[0] = filename_sou2;
		param[1] = "sou2";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_sou3_OnMouseClicked(ActionEvent event){

		param[0] = filename_sou3;
		param[1] = "sou3";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_sou4_OnMouseClicked(ActionEvent event){

		param[0] = filename_sou4;
		param[1] = "sou4";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_sou5_OnMouseClicked(ActionEvent event){

		param[0] = filename_sou5;
		param[1] = "sou5";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_sou6_OnMouseClicked(ActionEvent event){

		param[0] = filename_sou6;
		param[1] = "sou6";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_sou7_OnMouseClicked(ActionEvent event){

		param[0] = filename_sou7;
		param[1] = "sou7";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_sou8_OnMouseClicked(ActionEvent event){

		param[0] = filename_sou8;
		param[1] = "sou8";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_sou9_OnMouseClicked(ActionEvent event){

		param[0] = filename_sou9;
		param[1] = "sou9";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_ton_OnMouseClicked(ActionEvent event){

		param[0] = filename_ton;
		param[1] = "ton";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_nan_OnMouseClicked(ActionEvent event){

		param[0] = filename_nan;
		param[1] = "nan";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_sha_OnMouseClicked(ActionEvent event){

		param[0] = filename_sha;
		param[1] = "sha";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_pei_OnMouseClicked(ActionEvent event){

		param[0] = filename_pei;
		param[1] = "pei";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_haku_OnMouseClicked(ActionEvent event){

		param[0] = filename_haku;
		param[1] = "haku";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_hatu_OnMouseClicked(ActionEvent event){

		param[0] = filename_hatu;
		param[1] = "hatu";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	@FXML
	public void bt_chun_OnMouseClicked(ActionEvent event){

		param[0] = filename_chun;
		param[1] = "chun";
		pset.setParam(param);

		//画面を閉じる
		((Node)event.getSource()).getScene().getWindow().hide();
	}

}
