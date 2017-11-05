/* made by Sarah Abowitz to generate hash codes for storing prompts in the json tree in
 Firebase Databases */

public class Keymaker {
	public static void main (String[] args){
	  int n = 100;
	  String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	  for (int i = 0; i < n; i++){
		String res = "-K2ib";   
		for (int j = 0; j < 15; j++){
		  int l = (int) (Math.random()*str.length());
		  if (l == str.length()){
		    res += "z";
		  } else { 
			res += str.substring(l, l+1);
		  }
		}
		System.out.println(res);
	  }
	}
}

/* look at all the codes we made!

-K2ibOp5tvX3kJwlqkC2 .
-K2ibbkovKTxpzDoLQZk .
-K2ibr3BE1WNX2rVQpZF .
-K2ibaOuJwoQeyhuYn6M .
-K2ibI0tuEL4iShOsiMK .
-K2ibUxNScbAQBhAHdJz .
-K2ibaEVti984jtkeHTP .
-K2ibxXQ06IYDxbiiBFD .
-K2ibgyX5hsNRl0oak9Z .
-K2ibv57o3tFoJESu4zw .
-K2ibdQfrC6cUbuxAbnb .
-K2ibFeHAzqBaGlQVoQ6 .
-K2ibLRPihXRF1uXjTyC .
-K2ibZFdPtIlV1ql9UEl .
-K2ibgkrmyEV06Nelg88 .
-K2ibT7oeMY4nhhoywkq .
-K2ibibwOpMAEB8SOWF6 .
-K2ibTFvGJTd57PTZncJ
-K2ib3GP8hZzVQcaX5rT
-K2ibSviGMu8r2AWFjsF
-K2ibuhG4GDP0tC6punw
-K2ibdpx24inB8Vv3R4n
-K2ibovwMfJCFWdh3Ata
-K2ibpbzVc2sOFelz1QO
-K2ibisocHXFRw3fD3d9
-K2ibqKbtmGgTniPACLM
-K2ibuItCl9w5Uw34CtL
-K2ibxEHY5h098JFTG0b
-K2ibtQqc5iUMUUVWFcx
-K2ibF6IfBuMvVLGd0e8
-K2ibIhJTJwsnOdS3LGt
-K2ibZCNh9R6E5w28Tc7
-K2ibiuWdxJSZLKPOxKc
-K2ibHqDtSOWCPYD2UAP
-K2ibkAwXVzR6wcqyA6X
-K2ibsIOTJFKPWLxXpKN
-K2ibyGGV5iV7VUm7xoS
-K2ibHQApFwYMTQzVt1N
-K2ibgckNv7N0Uiy4Kcm
-K2ib3tzmrUZm5KIJd6n
-K2ibw69WK3uMbuwfEzb
-K2ibpJ7qNRAxffTNO3I
-K2ibMzKgV4Vd4EaUY2e
-K2ibrnZIxdcke8ITfVO
-K2ibwOM9qEzOTrQip1R
-K2ibTYt066axyi8HdYY
-K2ib3q2jXBAMPXeSoTP
-K2ib3WiCHMT2raIOuLY
-K2ibINsOtaEG2iTUduu
-K2ibnCb6R6rCMkaHUXE
-K2ibVFumTGPrgGGZKNY
-K2ibcOfHejKf2fv2o1Y
-K2ibTz5tSmVtBh7G5qM
-K2ib1SCTGWrPL0sSAmJ
-K2ibNaEeboAEaxpCCSq
-K2ibBFgC5ZafdqNwWqG
-K2ibBSEFwV5ezLETkTg
-K2ibGkQI4NIFKJHByQq
-K2ib0PFFgLS9kyNe8J3
-K2ibsFb1IzZabV6TYnT
-K2ib1KSiYdIjJ7j2I4f
-K2ibrmZiaJLnm0pCqCL
-K2ibRHqFvRA1TQjtFqZ
-K2ibEZxKFUHB3EF4PlP
-K2ibTjfTX2MXv5A094v
-K2ibMPA34AE5s5JASaG
-K2ib8ZO9Labt7GssmDl
-K2ibuOBA8xpme90P8NA
-K2ibtq36dveg3leE34Q
-K2ibtRv59SiEar0YJoU
-K2ibLmPWUG224hAP8cS
-K2ibUG0rvOYNFoSnwqL
-K2ibtYNEQ4JPa1uwasa
-K2ibcDzHAwAxJ6KSTKH
-K2ibpez6rt7cKsaJl2e
-K2ib47DAT97OsIVen72
-K2ibWFW7JDnukeTF3eU
-K2ibpvgR5UASigtcGul
-K2ibMax2IXJ9heELFdL
-K2ibsLr7KgrnC628gtg
-K2ib009aAXIVHcaSuET
-K2ibTArGo3xPcFN2jJU
-K2ibHAjcrhOR5W94HgW
-K2ibvDJgpYO5Vtb7H9f
-K2ibhpbyUmRBTOUGiV1
-K2ibwSG41ymlNalb8VX
-K2ibTpWCGzAy1e3ZrHr
-K2ibKGbKeXFdElxsV4t
-K2ibIMbOw1MkaIcy4VN
-K2ibnGXgYiZp0lFAEBy
-K2ibpQPPOBQrujw53WR
-K2ib0mnC9XA7Wkd8et9
-K2ib2OmmFjvFNtaudlL
-K2ibVxVEOhsEeJ2yvXV
-K2ib7Qr0bWVCcl1aRXI
-K2iby6maXQRp65PlzTa
-K2ibYtLzk5gy5xh7Ye3
-K2ib88wHjqV7MLxQxUG
-K2ibIpNrkVXS0gJGvOX
-K2ibIssQ7ESUjeEZpun
*/