package com.epam.gwt.client.widgets;

import com.epam.gwt.client.i18n.GithubAnalyzerConstants;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.*;

import java.util.function.BiConsumer;

public class LoginDialogBox extends DialogBox {

    private static final GithubAnalyzerConstants CONSTANTS = GWT.create(GithubAnalyzerConstants.class);

    public LoginDialogBox(BiConsumer<String, String> onLoginButtonClickAction) {
        TextBox userNameField = new TextBox();
        PasswordTextBox passwordField = new PasswordTextBox();
        Button loginButton = new Button(CONSTANTS.loginButtonText());
        loginButton.addClickHandler(event -> onLoginButtonClickAction.accept(userNameField.getText(), passwordField.getText()));

        VerticalPanel verticalPanel = new VerticalPanel();
        verticalPanel.add(userNameField);
        verticalPanel.add(passwordField);
        verticalPanel.add(loginButton);

        setText(CONSTANTS.dialogBoxTitle());
        setAnimationEnabled(true);
        add(verticalPanel);
    }
}
