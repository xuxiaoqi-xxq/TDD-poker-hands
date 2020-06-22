package poker_hands_go

import "testing"

func TestAnalysePokerHands(t *testing.T) {
	type args struct {
		pokerHands string
	}
	var tests = []struct {
		name string
		args args
		want string
	}{
		{
			name: "should_return_AAA_when_AnalysePokerHands('AAA')",
			args: args{pokerHands: "AAA"},
			want: "AAA",
		},
		{
			name: "should_return_ABC_when_AnalysePokerHands('ABC')",
			args: args{pokerHands: "ABC"},
			want: "ABC",
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := AnalysePokerHands(tt.args.pokerHands); got != tt.want {
				t.Errorf("AnalysePokerHands() = %v, want %v", got, tt.want)
			}
		})
	}
}
