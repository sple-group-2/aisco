#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.baktisosial --module-path aisco.product.baktisosial -m aisco.product.baktisosial &

wait