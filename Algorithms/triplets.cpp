//
// Created by will on 7/7/17.
//

#include <iostream>
#include <bits/stdc++.h>

using namespace std;

/*
vector <int> solve(int a0, int a1, int a2, int b0, int b1, int b2) {
    vector <int> result;
    int a = 0, b = 0;

    if (a0 > b0) {
        a++;
    }
    if (a0 < b0) {
        b++;
    }

    if (a1 > b1) {
        a++;
    }
    if (a1 < b1) {
        b++;
    }

    if (a2 > b2) {
        a++;
    }
    if (a2 < b2) {
        b++;
    }

    result.push_back(a);
    result.push_back(b);

    return result;
}*/

vector <int> solve(int a0, int a1, int a2, int b0, int b1, int b2) {
    vector <int> result(2, 0);

    if (a0 > b0) {
        result[0]++;
    }
    if (a0 < b0) {
        result[1]++;
    }

    if (a1 > b1) {
        result[0]++;
    }
    if (a1 < b1) {
        result[1]++;
    }

    if (a2 > b2) {
        result[0]++;
    }
    if (a2 < b2) {
        result[1]++;
    }

    return result;
}

int triplets_main() {
    int a0;
    int a1;
    int a2;
    cin >> a0 >> a1 >> a2;
    int b0;
    int b1;
    int b2;
    cin >> b0 >> b1 >> b2;

    vector <int> result = solve(a0, a1, a2, b0, b1, b2);
    for (ssize_t i = 0; i < result.size(); i++) {
        cout << result[i] << (i != result.size() - 1 ? " ": "");
    }
    cout << endl;

    return 0;
}