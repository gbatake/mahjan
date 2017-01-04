package sample_java001;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainController  implements Initializable {


	//ボタン
	@FXML Button button_hai1 = new Button();
	@FXML Button button_hai2 = new Button();
	@FXML Button button_hai3 = new Button();
	@FXML Button button_hai4 = new Button();
	@FXML Button button_hai5 = new Button();
	@FXML Button button_hai6 = new Button();
	@FXML Button button_hai7 = new Button();
	@FXML Button button_hai8 = new Button();
	@FXML Button button_hai9 = new Button();
	@FXML Button button_hai10 = new Button();
	@FXML Button button_hai11 = new Button();
	@FXML Button button_hai12 = new Button();
	@FXML Button button_hai13 = new Button();
	@FXML Button button_hai14 = new Button();
	@FXML Button button_dora = new Button();
	@FXML Button button_uradora = new Button();

	@FXML Button button_pon1 = new Button();
	@FXML Button button_tii1 = new Button();
	@FXML Button button_akan1 = new Button();
	@FXML Button button_mkan1 = new Button();
	@FXML Button button_pon2 = new Button();
	@FXML Button button_tii2 = new Button();
	@FXML Button button_akan2 = new Button();
	@FXML Button button_mkan2 = new Button();
	@FXML Button button_pon3 = new Button();
	@FXML Button button_tii3 = new Button();
	@FXML Button button_akan3 = new Button();
	@FXML Button button_mkan3 = new Button();
	@FXML Button button_pon4 = new Button();
	@FXML Button button_tii4 = new Button();
	@FXML Button button_akan4 = new Button();
	@FXML Button button_mkan4 = new Button();

	@FXML Button button_calc = new Button();

	//ボタン画像
	@FXML ImageView imv_hai1 = new ImageView();
	@FXML ImageView imv_hai2 = new ImageView();
	@FXML ImageView imv_hai3 = new ImageView();
	@FXML ImageView imv_hai4 = new ImageView();
	@FXML ImageView imv_hai5 = new ImageView();
	@FXML ImageView imv_hai6 = new ImageView();
	@FXML ImageView imv_hai7 = new ImageView();
	@FXML ImageView imv_hai8 = new ImageView();
	@FXML ImageView imv_hai9 = new ImageView();
	@FXML ImageView imv_hai10 = new ImageView();
	@FXML ImageView imv_hai11 = new ImageView();
	@FXML ImageView imv_hai12 = new ImageView();
	@FXML ImageView imv_hai13 = new ImageView();
	@FXML ImageView imv_hai14 = new ImageView();
	@FXML ImageView imv_dora = new ImageView();
	@FXML ImageView imv_uradora = new ImageView();

	//コンボボックス
	@FXML ComboBox<String> combo_PorC = new ComboBox<String>();
	@FXML ComboBox<String> combo_wind = new ComboBox<String>();
	@FXML ComboBox<String> combo_agari = new ComboBox<String>();

	//サブ画面用パラメータ
	private String[] param = new String[100];
	Param pset = new Param();

	//ボタンフラグ　ポン・カン・チー
	Boolean flg_pon1 = false;
	Boolean flg_tii1 = false;
	Boolean flg_akan1 = false;
	Boolean flg_mkan1 = false;
	Boolean flg_pon2 = false;
	Boolean flg_tii2 = false;
	Boolean flg_akan2 = false;
	Boolean flg_mkan2 = false;
	Boolean flg_pon3 = false;
	Boolean flg_tii3 = false;
	Boolean flg_akan3 = false;
	Boolean flg_mkan3 = false;
	Boolean flg_pon4 = false;
	Boolean flg_tii4 = false;
	Boolean flg_akan4 = false;
	Boolean flg_mkan4 = false;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		//コンボボックス　親・子
		String oya = "親";
		String child = "子";
		combo_PorC.getItems().addAll(oya,child);

		//コンボボックス　自風
		String ton = "東";
		String nan = "南";
		String sha = "西";
		String pei = "北";
		combo_wind.getItems().addAll(ton,nan,sha,pei);

		//コンボボックス　和了
		String ron = "ロン";
		String tumo = "ツモ";
		combo_agari.getItems().addAll(ron,tumo);

		button_pon1.getStyleClass().clear();
		button_pon1.getStyleClass().addAll("button","buttondefault");

		button_tii1.getStyleClass().clear();
		button_tii1.getStyleClass().addAll("button","buttondefault");

		button_akan1.getStyleClass().clear();
		button_akan1.getStyleClass().addAll("button","buttondefault");

		button_mkan1.getStyleClass().clear();
		button_mkan1.getStyleClass().addAll("button","buttondefault");

		button_pon2.getStyleClass().clear();
		button_pon2.getStyleClass().addAll("button","buttondefault");

		button_tii2.getStyleClass().clear();
		button_tii2.getStyleClass().addAll("button","buttondefault");

		button_akan2.getStyleClass().clear();
		button_akan2.getStyleClass().addAll("button","buttondefault");

		button_mkan2.getStyleClass().clear();
		button_mkan2.getStyleClass().addAll("button","buttondefault");

		button_pon3.getStyleClass().clear();
		button_pon3.getStyleClass().addAll("button","buttondefault");

		button_tii3.getStyleClass().clear();
		button_tii3.getStyleClass().addAll("button","buttondefault");

		button_akan3.getStyleClass().clear();
		button_akan3.getStyleClass().addAll("button","buttondefault");

		button_mkan3.getStyleClass().clear();
		button_mkan3.getStyleClass().addAll("button","buttondefault");

		button_pon4.getStyleClass().clear();
		button_pon4.getStyleClass().addAll("button","buttondefault");

		button_tii4.getStyleClass().clear();
		button_tii4.getStyleClass().addAll("button","buttondefault");

		button_akan4.getStyleClass().clear();
		button_akan4.getStyleClass().addAll("button","buttondefault");

		button_mkan4.getStyleClass().clear();
		button_mkan4.getStyleClass().addAll("button","buttondefault");

	}

	@FXML
	public void button_hai1_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai1.setImage(im_man);
	}

	@FXML
	public void button_hai2_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai2.setImage(im_man);
	}

	@FXML
	public void button_hai3_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai3.setImage(im_man);
	}

	@FXML
	public void button_hai4_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai4.setImage(im_man);
	}

	@FXML
	public void button_hai5_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai5.setImage(im_man);
	}

	@FXML
	public void button_hai6_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai6.setImage(im_man);
	}

	@FXML
	public void button_hai7_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai7.setImage(im_man);
	}

	@FXML
	public void button_hai8_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai8.setImage(im_man);
	}

	@FXML
	public void button_hai9_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai9.setImage(im_man);
	}

	@FXML
	public void button_hai10_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai10.setImage(im_man);
	}

	@FXML
	public void button_hai11_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai11.setImage(im_man);
	}

	@FXML
	public void button_hai12_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai12.setImage(im_man);
	}

	@FXML
	public void button_hai13_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai13.setImage(im_man);
	}

	@FXML
	public void button_hai14_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_hai14.setImage(im_man);
	}

	@FXML
	public void button_dora_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_dora.setImage(im_man);
	}

	@FXML
	public void button_uradora_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];

		//選択牌IDを設定

		//選択牌を設定
		Image im_man = new Image(imFileName);
		imv_uradora.setImage(im_man);
	}

	@FXML
	public void button_pon1_OnMouseCliceked(){

		if(flg_pon1 == false){
			//押下状態
			button_pon1.getStyleClass().clear();
			button_pon1.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_tii1.getStyleClass().clear();
			button_tii1.getStyleClass().addAll("button","buttondefault");
			button_akan1.getStyleClass().clear();
			button_akan1.getStyleClass().addAll("button","buttondefault");
			button_mkan1.getStyleClass().clear();
			button_mkan1.getStyleClass().addAll("button","buttondefault");

			flg_pon1 = true;
			flg_tii1 = false;
			flg_akan1 = false;
			flg_mkan1 = false;

		}else{
			//押下状態解除
			button_pon1.getStyleClass().clear();
			button_pon1.getStyleClass().addAll("button","buttondefault");

			flg_pon1 = false;
		}
	}

	@FXML
	public void button_tii1_OnMouseCliceked(){

		if(flg_tii1 == false){
			//押下状態
			button_tii1.getStyleClass().clear();
			button_tii1.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon1.getStyleClass().clear();
			button_pon1.getStyleClass().addAll("button","buttondefault");
			button_akan1.getStyleClass().clear();
			button_akan1.getStyleClass().addAll("button","buttondefault");
			button_mkan1.getStyleClass().clear();
			button_mkan1.getStyleClass().addAll("button","buttondefault");

			flg_pon1 = false;
			flg_tii1 = true;
			flg_akan1 = false;
			flg_mkan1 = false;

		}else{
			//押下状態解除
			button_tii1.getStyleClass().clear();
			button_tii1.getStyleClass().addAll("button","buttondefault");

			flg_tii1 = false;
		}
	}

	@FXML
	public void button_akan1_OnMouseCliceked(){

		if(flg_akan1 == false){
			//押下状態
			button_akan1.getStyleClass().clear();
			button_akan1.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon1.getStyleClass().clear();
			button_pon1.getStyleClass().addAll("button","buttondefault");
			button_tii1.getStyleClass().clear();
			button_tii1.getStyleClass().addAll("button","buttondefault");
			button_mkan1.getStyleClass().clear();
			button_mkan1.getStyleClass().addAll("button","buttondefault");

			flg_pon1 = false;
			flg_tii1 = false;
			flg_akan1 = true;
			flg_mkan1 = false;

		}else{
			//押下状態解除
			button_akan1.getStyleClass().clear();
			button_akan1.getStyleClass().addAll("button","buttondefault");

			flg_akan1 = false;
		}

	}

	@FXML
	public void button_mkan1_OnMouseCliceked(){

		if(flg_mkan1 == false){
			//押下状態
			button_mkan1.getStyleClass().clear();
			button_mkan1.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon1.getStyleClass().clear();
			button_pon1.getStyleClass().addAll("button","buttondefault");
			button_tii1.getStyleClass().clear();
			button_tii1.getStyleClass().addAll("button","buttondefault");
			button_akan1.getStyleClass().clear();
			button_akan1.getStyleClass().addAll("button","buttondefault");

			flg_pon1 = false;
			flg_tii1 = false;
			flg_akan1 = false;
			flg_mkan1 = true;

		}else{
			//押下状態解除
			button_mkan1.getStyleClass().clear();
			button_mkan1.getStyleClass().addAll("button","buttondefault");

			flg_mkan1 = false;
		}

	}

	@FXML
	public void button_pon2_OnMouseCliceked(){

		if(flg_pon2 == false){
			//押下状態
			button_pon2.getStyleClass().clear();
			button_pon2.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_tii2.getStyleClass().clear();
			button_tii2.getStyleClass().addAll("button","buttondefault");
			button_akan2.getStyleClass().clear();
			button_akan2.getStyleClass().addAll("button","buttondefault");
			button_mkan2.getStyleClass().clear();
			button_mkan2.getStyleClass().addAll("button","buttondefault");

			flg_pon2 = true;
			flg_tii2 = false;
			flg_akan2 = false;
			flg_mkan2 = false;

		}else{
			//押下状態解除
			button_pon2.getStyleClass().clear();
			button_pon2.getStyleClass().addAll("button","buttondefault");

			flg_pon2 = false;
		}
	}

	@FXML
	public void button_tii2_OnMouseCliceked(){

		if(flg_tii2 == false){
			//押下状態
			button_tii2.getStyleClass().clear();
			button_tii2.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon2.getStyleClass().clear();
			button_pon2.getStyleClass().addAll("button","buttondefault");
			button_akan2.getStyleClass().clear();
			button_akan2.getStyleClass().addAll("button","buttondefault");
			button_mkan2.getStyleClass().clear();
			button_mkan2.getStyleClass().addAll("button","buttondefault");

			flg_pon2 = false;
			flg_tii2 = true;
			flg_akan2 = false;
			flg_mkan2 = false;

		}else{
			//押下状態解除
			button_tii2.getStyleClass().clear();
			button_tii2.getStyleClass().addAll("button","buttondefault");

			flg_tii2 = false;
		}
	}

	@FXML
	public void button_akan2_OnMouseCliceked(){

		if(flg_akan2 == false){
			//押下状態
			button_akan2.getStyleClass().clear();
			button_akan2.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon2.getStyleClass().clear();
			button_pon2.getStyleClass().addAll("button","buttondefault");
			button_tii2.getStyleClass().clear();
			button_tii2.getStyleClass().addAll("button","buttondefault");
			button_mkan2.getStyleClass().clear();
			button_mkan2.getStyleClass().addAll("button","buttondefault");

			flg_pon2 = false;
			flg_tii2 = false;
			flg_akan2 = true;
			flg_mkan2 = false;

		}else{
			//押下状態解除
			button_akan2.getStyleClass().clear();
			button_akan2.getStyleClass().addAll("button","buttondefault");

			flg_akan2 = false;
		}

	}

	@FXML
	public void button_mkan2_OnMouseCliceked(){

		if(flg_mkan2 == false){
			//押下状態
			button_mkan2.getStyleClass().clear();
			button_mkan2.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon2.getStyleClass().clear();
			button_pon2.getStyleClass().addAll("button","buttondefault");
			button_tii2.getStyleClass().clear();
			button_tii2.getStyleClass().addAll("button","buttondefault");
			button_akan2.getStyleClass().clear();
			button_akan2.getStyleClass().addAll("button","buttondefault");

			flg_pon2 = false;
			flg_tii2 = false;
			flg_akan2 = false;
			flg_mkan2 = true;

		}else{
			//押下状態解除
			button_mkan2.getStyleClass().clear();
			button_mkan2.getStyleClass().addAll("button","buttondefault");

			flg_mkan2 = false;
		}

	}

	@FXML
	public void button_pon3_OnMouseCliceked(){

		if(flg_pon3 == false){
			//押下状態
			button_pon3.getStyleClass().clear();
			button_pon3.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_tii3.getStyleClass().clear();
			button_tii3.getStyleClass().addAll("button","buttondefault");
			button_akan3.getStyleClass().clear();
			button_akan3.getStyleClass().addAll("button","buttondefault");
			button_mkan3.getStyleClass().clear();
			button_mkan3.getStyleClass().addAll("button","buttondefault");

			flg_pon3 = true;
			flg_tii3 = false;
			flg_akan3 = false;
			flg_mkan3 = false;

		}else{
			//押下状態解除
			button_pon3.getStyleClass().clear();
			button_pon3.getStyleClass().addAll("button","buttondefault");

			flg_pon3 = false;
		}
	}

	@FXML
	public void button_tii3_OnMouseCliceked(){

		if(flg_tii3 == false){
			//押下状態
			button_tii3.getStyleClass().clear();
			button_tii3.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon3.getStyleClass().clear();
			button_pon3.getStyleClass().addAll("button","buttondefault");
			button_akan3.getStyleClass().clear();
			button_akan3.getStyleClass().addAll("button","buttondefault");
			button_mkan3.getStyleClass().clear();
			button_mkan3.getStyleClass().addAll("button","buttondefault");

			flg_pon3 = false;
			flg_tii3 = true;
			flg_akan3 = false;
			flg_mkan3 = false;

		}else{
			//押下状態解除
			button_tii3.getStyleClass().clear();
			button_tii3.getStyleClass().addAll("button","buttondefault");

			flg_tii3 = false;
		}
	}

	@FXML
	public void button_akan3_OnMouseCliceked(){

		if(flg_akan3 == false){
			//押下状態
			button_akan3.getStyleClass().clear();
			button_akan3.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon3.getStyleClass().clear();
			button_pon3.getStyleClass().addAll("button","buttondefault");
			button_tii3.getStyleClass().clear();
			button_tii3.getStyleClass().addAll("button","buttondefault");
			button_mkan3.getStyleClass().clear();
			button_mkan3.getStyleClass().addAll("button","buttondefault");

			flg_pon3 = false;
			flg_tii3 = false;
			flg_akan3 = true;
			flg_mkan3 = false;

		}else{
			//押下状態解除
			button_akan3.getStyleClass().clear();
			button_akan3.getStyleClass().addAll("button","buttondefault");

			flg_akan3 = false;
		}

	}

	@FXML
	public void button_mkan3_OnMouseCliceked(){

		if(flg_mkan3 == false){
			//押下状態
			button_mkan3.getStyleClass().clear();
			button_mkan3.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon3.getStyleClass().clear();
			button_pon3.getStyleClass().addAll("button","buttondefault");
			button_tii3.getStyleClass().clear();
			button_tii3.getStyleClass().addAll("button","buttondefault");
			button_akan3.getStyleClass().clear();
			button_akan3.getStyleClass().addAll("button","buttondefault");

			flg_pon3 = false;
			flg_tii3 = false;
			flg_akan3 = false;
			flg_mkan3 = true;

		}else{
			//押下状態解除
			button_mkan3.getStyleClass().clear();
			button_mkan3.getStyleClass().addAll("button","buttondefault");

			flg_mkan3 = false;
		}

	}

	@FXML
	public void button_pon4_OnMouseCliceked(){

		if(flg_pon4 == false){
			//押下状態
			button_pon4.getStyleClass().clear();
			button_pon4.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_tii4.getStyleClass().clear();
			button_tii4.getStyleClass().addAll("button","buttondefault");
			button_akan4.getStyleClass().clear();
			button_akan4.getStyleClass().addAll("button","buttondefault");
			button_mkan4.getStyleClass().clear();
			button_mkan4.getStyleClass().addAll("button","buttondefault");

			flg_pon4 = true;
			flg_tii4 = false;
			flg_akan4 = false;
			flg_mkan4 = false;

		}else{
			//押下状態解除
			button_pon4.getStyleClass().clear();
			button_pon4.getStyleClass().addAll("button","buttondefault");

			flg_pon4 = false;
		}
	}

	@FXML
	public void button_tii4_OnMouseCliceked(){

		if(flg_tii4 == false){
			//押下状態
			button_tii4.getStyleClass().clear();
			button_tii4.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon4.getStyleClass().clear();
			button_pon4.getStyleClass().addAll("button","buttondefault");
			button_akan4.getStyleClass().clear();
			button_akan4.getStyleClass().addAll("button","buttondefault");
			button_mkan4.getStyleClass().clear();
			button_mkan4.getStyleClass().addAll("button","buttondefault");

			flg_pon4 = false;
			flg_tii4 = true;
			flg_akan4 = false;
			flg_mkan4 = false;

		}else{
			//押下状態解除
			button_tii4.getStyleClass().clear();
			button_tii4.getStyleClass().addAll("button","buttondefault");

			flg_tii4 = false;
		}
	}

	@FXML
	public void button_akan4_OnMouseCliceked(){

		if(flg_akan4 == false){
			//押下状態
			button_akan4.getStyleClass().clear();
			button_akan4.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon4.getStyleClass().clear();
			button_pon4.getStyleClass().addAll("button","buttondefault");
			button_tii4.getStyleClass().clear();
			button_tii4.getStyleClass().addAll("button","buttondefault");
			button_mkan4.getStyleClass().clear();
			button_mkan4.getStyleClass().addAll("button","buttondefault");

			flg_pon4 = false;
			flg_tii4 = false;
			flg_akan4 = true;
			flg_mkan4 = false;

		}else{
			//押下状態解除
			button_akan4.getStyleClass().clear();
			button_akan4.getStyleClass().addAll("button","buttondefault");

			flg_akan4 = false;
		}

	}

	@FXML
	public void button_mkan4_OnMouseCliceked(){

		if(flg_mkan4 == false){
			//押下状態
			button_mkan4.getStyleClass().clear();
			button_mkan4.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon4.getStyleClass().clear();
			button_pon4.getStyleClass().addAll("button","buttondefault");
			button_tii4.getStyleClass().clear();
			button_tii4.getStyleClass().addAll("button","buttondefault");
			button_akan4.getStyleClass().clear();
			button_akan4.getStyleClass().addAll("button","buttondefault");

			flg_pon4 = false;
			flg_tii4 = false;
			flg_akan4 = false;
			flg_mkan4 = true;

		}else{
			//押下状態解除
			button_mkan4.getStyleClass().clear();
			button_mkan4.getStyleClass().addAll("button","buttondefault");

			flg_mkan4 = false;
		}

	}

	@FXML
	public void button_calc_OnMouseCliceked(){
		System.out.println("calc");

	}

	private void select_start(){
		try {
			// 新しいウインドウを生成
			Stage newStage = new Stage();
			//ツールバーなし
			newStage.initStyle(StageStyle.UNDECORATED);
			// モーダルウインドウに設定
			newStage.initModality(Modality.APPLICATION_MODAL);
			// オーナーを設定
			newStage.initOwner(null);
			// 新しいウインドウ内に配置するコンテンツを生成
			BorderPane root = (BorderPane) FXMLLoader
					.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(root, 650, 450);
			scene.getStylesheets()
					.add(getClass().getResource("select.css").toExternalForm());
			newStage.setScene(scene);
			// 新しいウインドウを表示
			newStage.showAndWait();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}


}
