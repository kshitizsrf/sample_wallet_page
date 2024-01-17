package com.practice.android.putatoewallet;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button transfer, back;
    ImageView addMoney, redeemCredit, sendMoneyToBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        back = findViewById(R.id.back);
        addMoney = findViewById(R.id.add_money);
        redeemCredit = findViewById(R.id.redeem_credit);
        sendMoneyToBank = findViewById(R.id.send_to_bank);
        transfer = findViewById(R.id.transfer_money);

        transfer.setOnClickListener(v -> {
            TransferMoneyDialog dialog = new TransferMoneyDialog();
            dialog.show(getSupportFragmentManager(), "TransferMoneyDialog");
        });

        addMoney.setOnClickListener(v -> {
            AddMoneyDialog dialog = new AddMoneyDialog();
            dialog.show(getSupportFragmentManager(), "AddMoneyDialog");
        });

        redeemCredit.setOnClickListener(v -> {
            Toast.makeText(this, "Processing please wait", Toast.LENGTH_SHORT).show();
            RedeemCreditDialog dialog = new RedeemCreditDialog();
            dialog.show(getSupportFragmentManager(), "RedeemCreditDialog");
        });

        sendMoneyToBank.setOnClickListener(v -> {
            AddBankDialog dialog = new AddBankDialog();
            dialog.show(getSupportFragmentManager(), "AddBankDialog");
        });

        back.setOnClickListener(v -> finish());
    }
}