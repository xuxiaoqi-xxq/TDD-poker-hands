package poker_hands_go

import "testing"

func TestDemo(t *testing.T) {
	type args struct {
		s string
	}
	var tests = []struct {
		name string
		args args
		want string
	}{
		{
			name: "test01('AAA')",
			args: args{s: "AAA"},
			want: "AAA",
		},
		{
			name: "test01('ABC')",
			args: args{s: "ABC"},
			want: "ABC",
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := Run(tt.args.s); got != tt.want {
				t.Errorf("Run() = %v, want %v", got, tt.want)
			}
		})
	}
}
